# 🚀 Leçon 15 — Introduction à Spring Boot

## 📖 Ce que j'ai appris dans cette leçon

J'ai découvert les bases avant de coder : HTTP, REST, Spring, Spring Boot, Maven. Ces notions sont **indispensables** avant de créer une API.

---

## 🌐 HTTP (HyperText Transfer Protocol)

HTTP est le protocole de communication du web entre un client (navigateur, Postman) et un serveur (mon API Spring Boot).

### Les méthodes HTTP

| Méthode | Rôle | Exemple |
|---------|------|---------|
| GET | Récupérer | `GET /users` |
| POST | Créer | `POST /users` |
| PUT | Remplacer | `PUT /users/1` |
| PATCH | Modifier partiellement | `PATCH /users/1` |
| DELETE | Supprimer | `DELETE /users/1` |

### Les codes de statut

| Code | Signification |
|------|---------------|
| 200 | OK |
| 201 | Created |
| 204 | No Content |
| 400 | Bad Request |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |
| 409 | Conflict |
| 500 | Internal Server Error |

---

## 🛠️ REST (Representational State Transfer)

REST est un style d'architecture pour construire des API. Il repose sur :
- Les **méthodes HTTP** (GET, POST, PUT, DELETE).
- Des **URLs** claires et hiérarchiques.
- Un format d'échange standard : **JSON**.
- Des requêtes **indépendantes** (stateless).

### Exemple d'API REST
