---
type: exercise
template: document
slug: exercise-groovy-pyramid-generator
image:
tags:
- groovy
- exercise
---

Génération de pyramides
====================================

## Abstract

Cet exercice complet vous permet de manipuler différents éléments syntaxiques du langage Groovy.

## Contenu

Etant donné un entier positif `n`, implémentez une fonction qui retourne une liste représentant une pyramide avec `n` niveaux utilisant le caractère `#`. Assuez-vous que la pyramide possède des espaces à gauche et à droite.

## Alternative

Implémentez une version récursive de votre première implémentation.

## Examples

```groovy
pyramid(1)
'#'

pyramid(2)
' # '
'###'

pyramid(3)
'  #  '
' ### '
'#####'
```