 
# 🚀 Leçon 07 — Les chaînes de caractères (String)

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à manipuler du texte comme un pro. Les `String` sont partout en backend : noms d'utilisateurs, emails, messages, requêtes HTTP, données JSON, etc. C'est un sujet **crucial** pour un développeur Java.

---

## 🔑 Ce qu'il faut absolument retenir

### 1. `String` est **immutable**

Une fois qu'une `String` est créée, on ne peut pas la modifier. Toute opération qui semble "modifier" une `String` crée en fait une **nouvelle** `String`.

```java
String nom = "Alice";
nom = nom + " Dupont"; // Ne modifie pas "Alice", crée une nouvelle String "Alice Dupont"