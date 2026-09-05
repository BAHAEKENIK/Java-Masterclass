# 🚀 Leçon 08 — Programmation Orientée Objet (OOP)

## 📖 Ce que j'ai appris dans cette leçon

J'ai découvert le cœur de Java : la **Programmation Orientée Objet**. C'est une façon de structurer le code autour d'**objets** qui ont des **attributs** (caractéristiques) et des **méthodes** (comportements). C'est ce qui rend Java puissant pour les applications backend.

---

## 🔑 Les concepts fondamentaux

### 1. Qu'est-ce qu'une classe ?

Une **classe** est un modèle, un plan qui décrit comment seront les objets. Elle définit :
- Les **attributs** (les données, les caractéristiques).
- Les **méthodes** (les actions, les comportements).

**Analogie :** Une classe est comme le plan d'une maison. Le plan décrit les pièces, les dimensions, mais il n'est pas une maison. L'objet est la maison construite à partir de ce plan.

### 2. Qu'est-ce qu'un objet ?

Un **objet** est une **instance** d'une classe. C'est la réalisation concrète du modèle. Il a :
- Des **valeurs** pour ses attributs (ex: une maison avec des dimensions réelles).
- Il peut exécuter les méthodes définies dans la classe.

### 3. Syntaxe d'une classe simple

```java
public class Personne {
    // Attributs (ou champs)
    public String nom;
    public int age;

    // Méthodes
    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
    }
}