
---

# 🚀 LEÇON 21 — JPA / Hibernate / MySQL

## 📖 Objectif

Jusqu'ici, tes données sont **en mémoire** (dans une `ArrayList`). Elles disparaissent à chaque redémarrage. On va maintenant les **persister dans MySQL**.

---

## 1. Les concepts

| Terme | Définition |
|-------|------------|
| **JDBC** | API Java de bas niveau pour parler à une BDD (verbeux) |
| **JPA** | Spécification Java pour mapper objets ↔ tables |
| **Hibernate** | Implémentation la plus utilisée de JPA |
| **Spring Data JPA** | Surcouche Spring qui simplifie JPA |

**Analogie :**
- **JDBC** = écrire du SQL à la main, gérer les connexions.
- **JPA/Hibernate** = tu écris des classes Java, Hibernate génère le SQL.
- **Spring Data JPA** = tu écris une interface, Spring génère l'implémentation.

---

## 2. Créer un nouveau projet Spring Boot

On va créer un nouveau projet propre pour JPA. Va sur **https://start.spring.io** :

| Champ | Valeur |
|-------|--------|
| **Project** | Maven |
| **Language** | Java |
| **Spring Boot** | 3.4.x (ou 4.0.x) |
| **Group** | `com.masterclass` |
| **Artifact** | `demo-jpa` |
| **Package name** | `com.masterclass.demojpa` |
| **Packaging** | Jar |
| **Java** | 21 |

**Dépendances à ajouter :**
- **Spring Web**
- **Spring Data JPA**
- **MySQL Driver**
- **Spring Boot DevTools**

Télécharge, décompresse dans :