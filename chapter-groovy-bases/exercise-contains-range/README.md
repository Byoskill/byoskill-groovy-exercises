# ContainsRange

Etant donné deux intervalles, implémentez une fonction qui vérifie si le premier interval contient le second.

Implémentez ensuite une version qui supporte l'objet Range de groovy.

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