## 🏆 Challenge final – Système de gestion de véhicules

### Résumé du challenge

J'ai créé un système complet de gestion de véhicules qui utilise **tous** les concepts de la POO :

| Concept | Utilisation |
|---------|-------------|
| Interface | `Assurable` définit le contrat d'assurance |
| Classe abstraite | `Vehicule` fournit une base commune |
| Héritage | `VoitureParticuliere` et `Camion` étendent `Vehicule` |
| Implémentation | Les deux classes implémentent `Assurable` |
| Encapsulation | Attributs `protected` avec getters/setters |
| Polymorphisme | Tableau de `Vehicule` contenant différentes sous-classes |
| `instanceof` | Vérification du type pour appeler des méthodes spécifiques |

### Le code final

**Interface Assurable :**
```java
public interface Assurable {
    double calculerPrimeAssurance();
    void afficherAssurance();
}