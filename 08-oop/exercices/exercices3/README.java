## 🔒 ÉTAPE 3 : L'encapsulation

### 1. Qu'est-ce que l'encapsulation ?

L'encapsulation est un principe qui consiste à **cacher les détails internes** d'un objet et à **contrôler l'accès** à ses données.

- Les attributs sont **privés** (`private`).
- On expose des méthodes **publiques** (`public`) : les **getters** et **setters**.

### 2. Pourquoi l'encapsulation ?

- **Sécurité** : empêcher les modifications incorrectes.
- **Contrôle** : valider les données avant de les modifier.
- **Maintenabilité** : changer l'implémentation sans impacter le code qui utilise la classe.

### 3. Les modificateurs d'accès

| Modificateur | Accès depuis la classe | Accès depuis l'extérieur |
|--------------|------------------------|--------------------------|
| `public` | ✅ | ✅ |
| `private` | ✅ | ❌ |

### 4. Exemple de getter et setter

```java
public class Personne {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        }
    }
}