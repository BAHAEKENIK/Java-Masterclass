# 🚀 Leçon 11 — Les génériques (Generics)

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à créer des classes, des interfaces et des méthodes qui fonctionnent avec **différents types** d'objets, tout en assurant la **sécurité des types** à la compilation. Les génériques sont essentiels pour écrire du code réutilisable et sûr.

---

## 🔑 Les concepts fondamentaux

### 1. Qu'est-ce qu'un générique ?

Un générique permet de paramétrer une classe ou une méthode avec un type. On utilise des lettres comme `T`, `E`, `K`, `V` pour représenter le type.

**Sans générique :** on peut mettre n'importe quel objet, mais on doit caster, ce qui peut causer des erreurs à l'exécution.

**Avec générique :** le compilateur vérifie le type, pas de cast nécessaire.

### 2. Syntaxe d'une classe générique

```java
public class Boite<T> {
    private T contenu;

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }
} 
