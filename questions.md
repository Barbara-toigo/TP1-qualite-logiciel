### barbara toïgo
# TP 1 : Test unitaire avec Eclipse 


## Exercice 2 : Création d’un TU vide

**Observer le code généré par Eclipse dans la classe `PersonTest`. Tracer vos remarques sur la structure de code : héritage, etc.**


**Héritage** : La classe `PersonTest` n'hérite d'aucune classe. 
Les assertions et le cycle de vie des tests sont gérés par JUnit 5 (`org.junit.jupiter.api`).
**Assertions** : Utilise `assertEquals` pour vérifier les valeurs attendues.
**JUnit** : Inclut `@BeforeEach` pour initialiser les objets avant chaque test.

## Exercice 3 : Exécution de TU

**Expliquer les résultats obtenus dans la vue JUnit.**

Dans la vue JUnit, on voit une liste des tests avec une indication de réussite ou d'échec. Si mes tests ne contiennent aucun contenu, ils sont marqués comme réussis (surement parce que "pas d'échec" = "réussite").

## Exercice 4 : Ecriture d’un TU

**Exécuter le test et interpréter le résultat obtenu. Continuer avec les autres méthodes.**

En lançant les tests, j'ai eu quelques erreurs de compilation (visibles dans la fenêtre des erreurs). Après avoir réglé ces problèmes, tous les tests ont été validés. Pour les méthodes `setName` et `setYears`, on a vérifié que les valeurs pouvaient bien être modifiées, tandis que pour `getName` et `getYears`, on a confirmé que les valeurs par défaut étaient "unknown" et 22.
