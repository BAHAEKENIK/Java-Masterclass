# 🚀 Leçon 05 — Les Méthodes (fonctions)

## 📖 Ce que j'ai appris dans cette leçon

Dans cette leçon, j'ai appris à organiser mon code en blocs réutilisables : les **méthodes**. C'est un peu comme créer des petites boîtes à outils que je peux appeler quand j'en ai besoin. Plus besoin de recopier le même code partout !

---

## 🔑 Le mot-clé `static` (je l'ai demandé exprès)

Ce mot-clé m'a un peu perturbé au début, mais maintenant je comprends :

- **`static`** = la méthode appartient à la **classe elle-même**, pas à un objet.
- La méthode `main` est `static` parce que la JVM doit pouvoir la lancer sans créer d'objet.
- Une méthode `static` ne peut appeler directement qu'une autre méthode `static`. Pour appeler une méthode non-`static`, il faut créer un objet (avec `new`).

**Exemple que j'ai testé :**
```java
public static void direBonjour() { ... }        // static
public void direAurevoir() { ... }              // non-static

// Dans main (static) :
direBonjour();                    // OK
Exercice1 ex = new Exercice1();   // je crée un objet
ex.direAurevoir();                // OK