---
type: exercise
template: document
slug: exercise-groovy-contains-range
image:
tags:
- groovy
- exercise
---

Gestion des intervalles
====================================

## Abstract

Cet exercice complet vous permettra de vous familiariser avec l'utilisation des structures de contrôle et les objets Range.

## Contenu

Etant donné deux intervalles, implémentez une fonction qui vérifie si le premier intervalle contient le second.

Implémentez ensuite une version qui supporte l'objet $Range$ de groovy.

## Examples

```groovy

// First version

containsRange(5, 7, 5, 7) // true
containsRange(1,12, 5,7) // true
containsRange(5,8, 5,9) // false

// Second version

containsRange(5..7, 5..7) // true
containsRange(1..12, 5..7) // true
containsRange(5..8, 5..9) // false
```