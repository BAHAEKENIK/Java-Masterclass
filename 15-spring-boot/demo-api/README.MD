# 🚀 Leçon 17 — Première API REST

## 📖 Ce que j'ai appris

J'ai créé mes premiers endpoints REST avec Spring Boot.

---

## 🔑 Les annotations clés

| Annotation | Rôle |
|------------|------|
| `@RestController` | Déclare un contrôleur REST (retourne du JSON/texte) |
| `@GetMapping("/url")` | Associe une méthode à une URL en GET |
| `@PathVariable` | Récupère une valeur dans l'URL |

---

## 💻 Les endpoints créés

### 1. `/hello` — Bonjour simple
```java
@GetMapping("/hello")
public String direBonjour() {
    return "Bonjour depuis Spring Boot !";
}