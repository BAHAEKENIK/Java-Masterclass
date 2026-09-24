# 🚀 Leçon 22 — DTO et Mappers

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à utiliser des **DTO (Data Transfer Objects)** pour séparer :
- Ce que le **client envoie** (Request DTO)
- Ce que le **serveur renvoie** (Response DTO)
- Ce qui est **stocké en base** (Entity)

C'est essentiel pour **la sécurité** et **la propreté** d'une API.

---

## 🔑 Pourquoi des DTO ?

Sans DTO, on retourne directement l'Entity → **dangereux** :

| Problème | Conséquence |
|----------|-------------|
| Exposition de champs sensibles | `motDePasse` renvoyé au client |
| Exposition de champs internes | `createdAt`, `updatedAt` |
| Couplage API ↔ BDD | Modifier l'entité casse l'API |
| Boucle infinie JSON | `@ManyToOne`/`@OneToMany` |

**Solution :** DTOs + Mappers.

---

## 🏗️ Architecture complète
