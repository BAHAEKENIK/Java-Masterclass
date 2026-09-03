# 🚀 Leçon 03 — Les Conditions (Prise de décision)

## 🎯 Objectif de la leçon
Apprendre à faire prendre des décisions à un programme Java en fonction de données (variables).

---

## 📚 Notions abordées

1. **`if / else`** : Exécuter un bloc de code si une condition est vraie, un autre si elle est fausse.
2. **`else if`** : Enchaîner plusieurs cas possibles.
3. **Opérateurs de comparaison** : `==`, `!=`, `>`, `<`, `>=`, `<=`
4. **Opérateurs logiques** : `&&` (ET), `||` (OU), `!` (NON)
5. **`switch`** : Alternative pour comparer une variable à plusieurs valeurs.
6. **Opérateur ternaire** : Raccourci `(condition) ? valeur_si_vrai : valeur_si_faux`.

---

## 🧠 Pièges absolus à retenir

| Piège | Explication |
|-------|-------------|
| **`=` vs `==`** | `=` est l'affectation. `==` est la comparaison. `if (x = 5)` est une erreur en Java. |
| **Division d'entiers** | `5 / 2` donne `2` (troncature). Pour avoir `2.5`, il faut `5.0 / 2`. |
| **Modulo `%`** | Donne le **reste** de la division. Ex: `10 % 4 = 2`. |
| **Comparer des String** | **NE JAMAIS** utiliser `==` pour comparer du texte. Utiliser `.equals()`. Ex: `"VIP".equals(typeCompte)`. |
| **Variable non initialisée** | On ne peut pas lire une variable locale si on ne lui a pas donné de valeur. |

---

## 💻 Exemples clés

### 1. `if / else if / else`
```java
int note = 85;

if (note >= 90) {
    System.out.println("A");
} else if (note >= 80) {
    System.out.println("B");
} else if (note >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
// Résultat : B