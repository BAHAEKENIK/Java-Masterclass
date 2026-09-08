
# 🚀 Leçon 09 — Les collections (ArrayList, HashSet, HashMap)

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à manipuler des groupes d'objets avec trois collections principales :

| Collection | Rôle | Doublons | Ordre | Accès |
|------------|------|----------|-------|-------|
| `ArrayList` | Liste dynamique | Autorisés | Préservé | Par indice |
| `HashSet` | Ensemble unique | Interdits | Non garanti | Par élément |
| `HashMap` | Paires clé-valeur | Clés uniques | Non garanti | Par clé |

---

## 📦 ArrayList

### Création et utilisation
```java
ArrayList<String> noms = new ArrayList<>();
noms.add("Alice");
noms.add("Bob");
String nom = noms.get(0); // Alice 
