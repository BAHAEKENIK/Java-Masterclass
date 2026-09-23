# 🚀 Leçon 21 — JPA / Hibernate + MySQL

## 📖 Ce que j'ai appris

J'ai appris à connecter Spring Boot à une base de données MySQL avec JPA et Hibernate. Les données sont maintenant **persistées** et survivent aux redémarrages.

---

## 🔑 Vocabulaire

| Terme | Rôle |
|-------|------|
| JPA | Spécification Java pour mapper objets ↔ tables SQL |
| Hibernate | Implémentation la plus utilisée de JPA |
| Entity | Classe Java ↔ Table SQL |
| JpaRepository | Interface CRUD automatique |
| MySQL | SGBD relationnel |

---

## 🛠️ Les étapes

### 1. Dépendances `pom.xml`
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>