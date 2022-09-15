---
type: exercise
template: document
slug: exercise-csvreader
image:
tags:
- groovy
- exercise
---

Parser un fichier CSV
====================================

## Abstract

Dans cet exercice, nous allons parser un fichier CSV sans utiliser de bibliothèques et ensuite avec commons-csv et @Grape.

## Contenu

Dans cet exercice, nous allons parser un fichier CSV sans utiliser de bibliothèques et ensuite avec commons-csv et @Grape.

* Le fichier CSV original est sur https://people.sc.fsu.edu/~jburkardt/data/csv/deniro.csv
* Il est possible de le télécharger en local ou bien de le lire depuis le réseau
* Créer un script "CsvReader"
* Lire le contenu du fichier CSV
* Parser chaque ligne du CSV
* Retourner la liste des films dont le score est > 80.

### Utilisation de Grab

Aller sur mvnrepository et chercher commons-csv.

Récupérer la commande Grape pour ajouter la dépendance à votre classe.

Modifier le code existant pour utiliser la bibliothèque.

La documentation de commons-csv est ici  : [https://commons.apache.org/proper/commons-csv/](Commons-CSV)

Les améliorations de la classe File sont ici : [https://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/File.html](Améliorations File)

Les améliorations de la classe Path sont ici : [https://docs.groovy-lang.org/latest/html/groovy-jdk/java/nio/file/Path.html](Améliorations File)


