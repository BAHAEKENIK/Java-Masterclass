# 🚀 Leçon 14 — Date et Time (API java.time)

## 📖 Ce que j'ai appris dans cette leçon

J'ai appris à manipuler les dates et les heures avec l'API `java.time` (Java 8+). C'est essentiel en backend pour gérer les dates de création, de modification, les délais, etc.

---

## 🔑 Les classes principales

| Classe | Rôle | Exemple |
|--------|------|---------|
| `LocalDate` | Date (année, mois, jour) | `2026-09-10` |
| `LocalTime` | Heure (h, min, s) | `14:30:00` |
| `LocalDateTime` | Date + heure | `2026-09-10T14:30` |
| `ZonedDateTime` | Date + heure + fuseau | `2026-09-10T14:30+02:00[Europe/Paris]` |
| `Duration` | Durée en secondes | `PT2H30M` |
| `Period` | Durée en années/mois/jours | `P1Y2M3D` |
| `DateTimeFormatter` | Formatage / parsing | `"dd/MM/yyyy"` |

---

## 📅 Création et manipulation

### LocalDate / LocalTime / LocalDateTime

```java
LocalDate aujourdhui = LocalDate.now();
LocalDate noel = LocalDate.of(2026, 12, 25);
LocalTime heure = LocalTime.of(14, 30);
LocalDateTime dateHeure = LocalDateTime.of(2026, 9, 10, 14, 30); 
