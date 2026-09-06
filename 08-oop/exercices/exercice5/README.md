## 🎭 ÉTAPE 5 : Le polymorphisme

### 1. Qu'est-ce que le polymorphisme ?

Le polymorphisme (plusieurs formes) est la capacité d'un objet à prendre plusieurs formes. Une variable de type `Employe` peut contenir un objet `Developpeur` ou `Manager`.

**Analogie :** Une télécommande universelle a un bouton "Démarrer" qui fonctionne sur différents appareils (TV, DVD, etc.) avec des comportements différents.

### 2. Pourquoi utiliser le polymorphisme ?

- **Code générique** : on écrit une fois, on réutilise partout.
- **Extensibilité** : on peut ajouter de nouvelles classes sans modifier le code existant.
- **Flexibilité** : on peut traiter des objets de différentes classes de manière uniforme.

### 3. Exemple

```java
Employe e1 = new Developpeur("Alice", 3000, 3);
Employe e2 = new Manager("Bob", 4000, 2);

e1.calculerSalaire(); // Appelle la méthode de Developpeur
e2.calculerSalaire(); // Appelle la méthode de Manager