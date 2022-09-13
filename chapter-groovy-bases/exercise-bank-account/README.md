---
type: exercise
template: document
slug: exercise-groovy-bankaccount
image:
tags:
- groovy
- exercise
- bank account
- compte bancaire
- kata
---

Simluation d'un compte bancaire.
====================================

## Abstract

Cet exercice complet vous permettra de mettre à l'épreuve vos connaisasnces Groovy.

## Contenu

Dans cet exercice, nous allons créer un composant qui simule un compte bancaire.

Un compte bancaire peut avoir un statut (fermé / ouvert).

Quand le compte est fermé, toutes les opérations dessus sont interdites hormi l'opération d'ouverture.

Un compte bancaire peut avoir deux types d'opérations : les dépôts et les retraits.

Le compte bancaire est initialisé avec un solde vide.

Les opérations de retraits et de dépot doivent être conservées pour audit. 

Chaque opération comporte un nom et un montant.

Un compte peut être fermé, si le compte est fermé, toutes les opérations doivent échouer.

Un retrait ne peut se faire que s'il y a de l'argent sur le compte.

Un dépot ne peut se faire qu'avec un montant positif.

### Amélioration

Ajouter une fonction de contrôle des comptes qui reprend la liste des opérations et vérifie que le montant actuel correspond.

### Amélioration 2

La banque propose deux types de comptes bancaires.

**Le compte courant** ne présente aucun frais liés aux opérations de retraits et de dépôts. Il n'est pas possible de retirer si le compte ne possède pas la somme attendue.

**Le compte pro** : le compte PRO permet d'avoir un solde négatif de 1000€. Chaque opération de retrait coûte 50 centimes. Les opérations réalisées avec un montant négatif ont un taux de frais de 1.5%.

**Le compte d'épargne**: le compte d'épargne à un solde minimal de 500€. Aucune opération ne peut être réalisée en dessous. Chaque retrait coûte 1€. A la fin du mois, l'argent déposé (uniquement) rapporte 1%.



