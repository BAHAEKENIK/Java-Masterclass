# 🚀 Leçon 04 — Les Boucles (for, while, do-while)

## 📖 Ce que j'ai appris dans cette leçon

Dans cette leçon, j'ai appris à répéter des blocs de code sans les écrire plusieurs fois. C'est super pratique pour traiter des listes, faire des calculs répétitifs ou attendre une condition.

### Les 3 types de boucles :

1. **`for`** : quand je sais à l'avance combien de fois je veux répéter.
   - Exemple : afficher les nombres de 1 à 10.

2. **`while`** : quand je répète tant qu'une condition est vraie, sans savoir à l'avance le nombre d'itérations.
   - Exemple : tant qu'un utilisateur n'a pas entré le bon mot de passe.

3. **`do-while`** : comme `while`, mais le code est exécuté au moins une fois, même si la condition est fausse.
   - Exemple : afficher un menu puis demander si on veut continuer.

---

## 🧠 Ce qui m'a marqué

- La boucle **`for`** est idéale quand on connaît le nombre de tours.
- La boucle **`while`** est plus souple, mais il faut faire attention à ne pas oublier d'incrémenter la variable, sinon elle tourne à l'infini (j'ai failli me faire avoir sur `i++`).
- La boucle **`do-while`** est pratique pour les saisies utilisateur, car on veut souvent afficher un message avant de tester la condition.

---

## 💻 Les exercices que j'ai faits

### Exercice 1 – `for`
J'ai affiché les nombres de 1 à 10, puis de 0 à 9.

```java
for (int i = 0; i <= 9; i++) {
    System.out.println(i);
}