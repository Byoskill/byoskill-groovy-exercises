---
type: exercise
template: document
slug: exercise-groovyshell
image:
tags:
- groovy
- exercise
---

Appeler un script Groovy depuis Java
====================================

## Abstract

Dans cet exercice, nous allons voir comment appeler un Script groovy depuis Java.

### Créer un script Groovy d'exemple

Créer un script Groovy retournant une valeur numérique ou une chaine de caractères.

### Créer une classe Java GroovyCall

Créer une classe GroovyCall avec une méthode `main()`.

A partir de cette méthode nous allons appeler le Script Groovy de plusieurs manières.

### Utiliser la fonction Eval

En préambule de l'exercice, nous allons utiliser la classe Eval pour exécuter des opérations simples.

Ecrivez le code suivant :

```java
Eval.me("2+3+4");
```

* Quel type de données est retourné par la méthode ?
* Quelle valeur à l'exécution est retournée ?

```java
Eval.me("println 'toto' ");
```

* Qu'est ce qu'a retourné le script ? Est ce que le message est apparu ?

```java
Eval.x(4,"2+3+x");
```

Quel est l'utilité de la méthode `x`ainsi que de xyz ?

### Utilisation de la classe GroovyScriptEngine.

Adaptez le code suivant pour exécuter votre script :

```java
String path = "chapter-working-with-groovy/exercise-groovyshell/src/test/resources";
final GroovyScriptEngine gse = new GroovyScriptEngine(path);
final Object result = gse.run("Script1.groovy", new Binding());
assert result == "Hello world";
```        

* A quoi sert l'objet Binding ? 



**Source**

[https://exercism.org/tracks/groovy/exercises/robot-name/solutions/KirillArtamonov](Exercise).
