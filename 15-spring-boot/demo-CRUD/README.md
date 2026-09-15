# 🚀 Leçon 19 — POST, PUT, DELETE (CRUD complet)

## 📖 Ce que j'ai appris

J'ai implémenté le **CRUD complet** (Create, Read, Update, Delete) sur plusieurs contrôleurs.

| Opération | Méthode HTTP | Annotation |
|-----------|--------------|------------|
| Create | POST | `@PostMapping` |
| Read | GET | `@GetMapping` |
| Update | PUT | `@PutMapping` |
| Delete | DELETE | `@DeleteMapping` |

---

## 🔑 Les annotations importantes

| Annotation | Rôle |
|------------|------|
| `@PostMapping` | Créer une ressource |
| `@PutMapping("/{id}")` | Remplacer une ressource |
| `@DeleteMapping("/{id}")` | Supprimer une ressource |
| `@RequestBody` | Récupère le JSON envoyé par le client |

---

## 💻 Exemple complet (ProduitController)

```java
@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    private final List<Produit> produits = new ArrayList<>();

    public ProduitController() {
        // Initialisation UNE SEULE FOIS
        produits.add(new Produit(1L, "souris", 15.15, 15));
    }

    @GetMapping
    public List<Produit> listerProduits() { return produits; }

    @GetMapping("/{id}")
    public Produit getProduit(@PathVariable Long id) { ... }

    @PostMapping
    public Produit creerProduit(@RequestBody Produit produit) {
        produits.add(produit);
        return produit;
    }

    @PutMapping("/{id}")
    public Produit modifierProduit(@PathVariable Long id, @RequestBody Produit p) { ... }

    @DeleteMapping("/{id}")
    public String supprimerProduit(@PathVariable Long id) {
        produits.removeIf(p -> p.getId().equals(id));
        return "Produit supprimé";
    }
}