---
type: exercise
template: document
slug: exercise-groovy-installer
image: 
tags:
 - groovy
 - installer
 - sdk
---

Utilisation du système de dépendances Grape
====================================

## Abstract

Cet exercice va vous permettre de découvrir le système de dépendances Grape afin d'apporter de nouvelles fonctionnalités à Groovy.

## Contenu

Le packaging Groovy est téléchargeable depuis le site [Apache Groovy](https://groovy.apache.org/download.html).

Il est possible d'utiliser Groovy de différentes façons : 

- via une image Docker qui vous mettrait à disposition les outils
- en téléchargeant le framework directement
- en utilisation un plugin dans votre IDE

### Le shell Groovy

Le shell Groovy est un utilitaire qui permet de facilement écrire des expressions en Langage Grovoy, de créer des classes et d'évaluer le résultat directement.
Autrement dit, cela ressemble à une calculette évoluée ou vous pouvez coder directement et évaluer vos instructions.

L'utilitaire contient de nombreuses fonctionnalités (historique des commandes, coloration syntaxique, aide etc)

Pour lancer l'utilitaire, tapez la commande `groovysh`.

**Attention avec le JDK 17 sous Unix, cela peut crasher**.

Voici une liste de commandes utiles : 

- `:help` : affiche les commandes disponibles dans le shell
- `:grab` : télécharger une dépendance Maven
- `:history` : affiche l'historique des commandes
- `:show all`: afficher l'ensemble des variables, classes, import déclarés.
- `:inspect [varname]`: inspecte le résultat du script ou d'une variable identifiée par son nom.
- `:save`: sauvegarde la liste des commandes saisies.

*A tester, saisir les commandes suivantes* : 

```groovy
temperature=20
:show variables

def convertFahrenheit(degrees) {
    double res = (degrees * 9/5) + 32;
    println ("Temperature in Fahrenheigt is $res") 
    return  res
}

:show all

convertFahrenheit(temperature)
```

En cas d'erreur de compilation, il est possible d'utiliser `:display` et `:clear` pour vérifier.

### L'interpréteur Groovy

L'interpréteur Groovy lit le contenu d'un fichier et l'exécute. On parle alors de *script* à la différence d'un programme qui doit respecter les standard Java (classe publique, méthode `main` etc).

Pour utiliser l'interpréteur, la commande la plus simple est : 

```groovy
groovy MonScript.groovy
```

Créons un fichier groovy `Fahrenheit.groovy` et recopions le contenu que nous avons testé précédemment.

```groovy
// Méthode de conversion
def convertFahrenheit(degrees) {
    (degrees * 9/5) + 32; 
}

temperature = 20
res = convertFahrenheit(temperature);
println ("Temperature in fahrenheit $res")

temperature = 0
res = convertFahrenheit(temperature);

println ("Temperature in fahrenheit $res")
```

Le résultat devrait afficher : 

```
{13:32}~/tools/groovy-4.0.5/bin ➭ code fahrenheit.groovy
{13:35}~/tools/groovy-4.0.5/bin ➭ groovy fahrenheit.groovy 
Temperature in fahrenheit 68
Temperature in fahrenheit 32
```

Astuce intéressante, il est possible d'utiliser des extensions ou des bibliothèques Java en ajoutant les JAR au classpath avec : 

```
groovy -cp jar1;jar2 Script.groovy
```

### Le compilateur Groovy

A la différence de l'interpréteur ou les instructions Groovy sont exécutées les une après les autres, sans génération de bytecode, le compilateur génère un fichier `.class` de votre Script ou de votre classe Groovy.

Ainsi, votre code Groovy va générer une classe Java, compilée qui peut être exécutée par la JVM.

Exemple de classe Groovy : 

```groovy
class Fahrenheit {

    def static convertFahrenheit(degrees) {
        (degrees * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        def res = convertFahrenheit(args[0] as Integer);
        println ("Temperature in fahrenheit $res")
    }
}
```

Compiler la classe Groovy avec : 

```bash
javac Fahrenheit.groovy
```

Exécuter la classe compilée avec : 

```bash
java -classpath ../lib/groovy-4.0.5.jar:. Fahrenheit 40
```

*Notez que les dépendances Groovy sont nécessaires*.

### Les utilitaires Grape

Groovy supporte le téléchargement automatique de bibliothèques afin d'améliorer les fonctionnalités de Groovy.

Ces bibliothèques sont téléchargées via le système Grape qui repose sur la technologie Apache IVY (proche de Maven).

L'utilitaire `grape` permet de télécharger des bibliothèques Maven, de les installer, supprimer etc?.


