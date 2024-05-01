# Apprentissage de la surcharge d'opérateurs en Groovy

## Abstract

Nous allons réaliser plusieurs exercices pour apprendre comment surcharger les opérateurs en Groovy pour simplifier l'écriture de certaines classes.

## Exercice 1

Nous allons créer un objet Calculatrice qui est capable de surcharger un ensemble d'opérateur afin d'éviter d'appeler les méthodes équivalentes.

Notre calculatrice doit pouvoir réaliser les opérations suivantes : 
* `+` addition
* `-` subtraction
* `*` multiplication
* `/` division
* `%` modulo
* `**` power

Nous souhaitons également ajouter les oprateurs afin d'inverser le signe de la valeur actuelle de la calculatrice.
* `- calculatrice` : inverse le signe de la valeur du calcul

Nous souhaitons désormais ajouter des fonctions pour vérifier le résultat du calcul.

Plutôt que d'écrire : 

```
if (calculatrice.value == '10') {
    /..
}
```

Ecire plutot : 

```
if (calculatrice == '10') {
    /..
}
```

Surcharger l'ensemble des opérateurs : 

```
* `==` equal
* `!=` different
* `<` inférieur
* `<=` inférieur ou égal
* `>` supérieur à 
* `>=` supérieur ou égal à
```

