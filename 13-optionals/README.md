# 🚀 Leçon 13 — Les Optionals

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à utiliser `Optional` pour gérer les valeurs absentes de manière élégante, sans `null` et sans `NullPointerException`. C'est un concept moderne de Java 8, très utilisé en backend.

---

## 🔑 Les concepts fondamentaux

### 1. Qu'est-ce qu'un Optional ?

Un `Optional` est un conteneur qui peut contenir soit une valeur, soit être vide. C'est une façon explicite de dire qu'une valeur peut être absente.

### 2. Création d'un Optional

```java
Optional<String> present = Optional.of("Bonjour");        // Valeur non nulle
Optional<String> vide = Optional.empty();                 // Vide
Optional<String> nullable = Optional.ofNullable(null);    // Vide si null 
