# StringJoin

Ecrire un programme comprenant :

Une fonction avec un paramètre de type liste de chaines de caractère.

La fonction doit retourner une chaine de caractère concaténant les éléments afin de vérifier les résultats suivants :

```groovy
[]
result =

["un"]
result = un

["un", "deux"]
result = un, deux

["un", "deux", "trois"]
result = un, deux, trois

["un", "deux", "trois", "quatre"]
result = un, deux, trois, quatre
```

## Amélioration 1
Nous vous proposons une amélioration, les chaînes de caractères ne contenant que des espaces doivent être filtrées et donc non affichées dans le résultat.

```groovy
[]
result =

["   "]
result =

["   ", "un"]
result = un

["   ", "un", "   "]
result = un

["   ", "un", "   ", "deux"]
result = un, deux

["un"]
result = un

["un", "deux"]
result = un, deux

["un", "deux", "trois"]
result = un, deux, trois

["un", "deux", "trois", "quatre"]
result = un, deux, trois, quatre
```
