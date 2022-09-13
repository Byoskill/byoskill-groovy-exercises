---
type: exercise
template: document
slug: exercise-groovy-distance-hamming
image:
tags:
- groovy
- exercise
---

Distance de Hamming
====================================

## Abstract

Cet exercice complet vous permet de manipuler différents éléments syntaxiques du langage Groovy.

## Contenu

La distance de Hamming est une notion mathématique, définie par Richard Hamming, et utilisée en informatique, en traitement du signal et dans les télécommunications. 

Elle joue un rôle important en théorie algébrique des codes correcteurs. Elle permet de quantifier la différence entre deux séquences de symboles. C'est une distance au sens mathématique du terme. À deux suites de symboles de même longueur, elle associe le nombre de positions où les deux suites diffèrent.

Le poids de Hamming correspond au nombre d'éléments différents de zéro dans une chaîne d'éléments d'un corps fini.

## Examples

```groovy
hamming("karolin", "kathrin") // 4
hamming("karolin", "kerstin") // 4
hamming("kathrin", "kerstin") // 3
hamming("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") // 4
```