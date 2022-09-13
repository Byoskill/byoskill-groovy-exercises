---
type: exercise
template: document
slug: exercise-groovy-countdown
image:
tags:
- groovy
- exercise
---

Compte à rebours
====================================

## Abstract

Dans cet exercice, nous allons faire un simple exercice de manipulation de thread.

## Contenu

Ecrire un programme possédant une classe CompteARebours qui permet pour une valeur donnée de décompter les secondes.

Le compte à rebours stoppe quand la valeur atteint zero.

Ce compte à rebours peut utiliser : 
- `Thread.start { }` pour créer un thread
- `AtomicInt` pour créer une valeur entière pouvant être synchronisée
