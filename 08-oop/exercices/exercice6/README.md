## 🧩 ÉTAPE 6 : Les classes abstraites

### 1. Qu'est-ce qu'une classe abstraite ?

Une classe abstraite est une classe qui **ne peut pas être instanciée** (on ne peut pas faire `new`). Elle sert de modèle pour d'autres classes.

**Analogie :** "Animal" est un concept abstrait. Dans la vraie vie, il n'existe pas d'animal générique, seulement des chiens, des chats, etc.

### 2. Pourquoi utiliser une classe abstraite ?

- **Modélisation** : représenter des concepts généraux.
- **Factorisation** : regrouper du code commun.
- **Contrat** : imposer aux sous-classes d'implémenter certaines méthodes.

### 3. Syntaxe

```java
public abstract class Forme {
    public String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void afficherCouleur() {
        System.out.println("Couleur : " + couleur);
    }

    // Méthode abstraite (sans corps)
    public abstract double calculerAire();
    public abstract double calculerPerimetre();
}