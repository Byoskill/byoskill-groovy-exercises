---
type: exercise
template: document
slug: exercice-1-installation-groovy-grape
image: 
tags:
 - installation
 - groovy
 - grape
---

Installation de Groovy et utilisation de Grape
====================================

## Abstract

Dans cet exercice, nous aborderons l'installation de Groovy et démontrerons l'utilisation de Grape pour la gestion des dépendances.

## Contenu

### Étape 1 : Installer Groovy

1. **Télécharger Groovy :**
   - Visitez la page de téléchargement officielle de Groovy : [Téléchargement de Groovy](http://groovy-lang.org/download.html)
   - Choisissez la version stable la plus récente et téléchargez la distribution binaire (ZIP ou TAR).

2. **Extraire Groovy :**
   - Extrayez l'archive téléchargée dans un emplacement sur votre ordinateur.

3. **Configurer l'emplacement de Groovy :**
   - Configurez la variable d'environnement `GROOVY_HOME` sur le répertoire où Groovy est extrait.
   - Ajoutez le répertoire `bin` de Groovy à la variable `PATH` de votre système.

4. **Vérifier l'installation :**
   - Ouvrez un nouveau terminal ou une invite de commandes.
   - Tapez `groovy -version` pour vérifier que Groovy est correctement installé.

### Étape 2 : Utiliser Grape pour inclure des dépendances

1. **Créer un script Groovy :**
   - Créez un nouveau fichier, par exemple `ExempleScript.groovy`.

2. **Ajouter une dépendance Grape :**
   - Dans votre script, utilisez Grape pour inclure une dépendance. Par exemple :
     ```groovy
     @Grapes([
         @Grab(group='groupe', module='module', version='1.0')
     ])
     ```

3. **Utiliser la dépendance :**
   - Rédigez un script simple qui utilise la fonctionnalité fournie par la dépendance incluse. Par exemple :
     ```groovy
     // Votre code ici en utilisant la dépendance ajoutée
     ```

4. **Exécuter le script :**
   - Enregistrez le script et exécutez-le à l'aide de la commande `groovy`.

### Étape 3 : Résolution dynamique des dépendances

1. **Modifier le script :**
   - Modifiez votre script pour résoudre dynamiquement les dépendances en utilisant Grape. Par exemple :
     ```groovy
     @Grab(group='org.example', module='bibliotheque-incroyable', version='2.0')
     ```

2. **Exécuter le script :**
   - Enregistrez le script et exécutez-le à l'aide de la commande `groovy`. Grape téléchargera et inclura dynamiquement la dépendance spécifiée.

### Conclusion

En suivant ces étapes, vous aurez installé Groovy et acquis une expérience pratique de l'utilisation de Grape pour la gestion des dépendances dans les scripts Groovy.
