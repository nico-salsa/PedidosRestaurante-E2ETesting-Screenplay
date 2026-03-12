# 🍽️ AUTO_FRONT_SCREENPLAY — Pedidos Restaurante

> Automated end-to-end testing for the Sofka restaurant frontend, built with **Serenity BDD** and the **Screenplay pattern**.

---

## 📖 User Story

**HDU-01 — Complete Order Flow via Restaurant UI**

```
As a customer of the Sofka restaurant application,
I want to log in, select a table, browse the menu, add items to the cart,
leave an optional note, and confirm my order,
So that I can place an order in a standardized and trackable way
through the user interface.
```

### ✅ Acceptance Criteria

| # | Scenario | Expected Result |
|:-:|----------|-----------------|
| 1 | Customer places an order **with a note** | Order confirmation screen is displayed |
| 2 | Customer places an order **without a note** | Order confirmation screen is displayed |

---

## 🏗️ Architecture — Screenplay Pattern

The Screenplay pattern models tests as interactions between **Actors** and the system. Each layer has a **single responsibility**.

```
📦 src/test/java/com/sofka/pedidos/
│
├── 🪝  hooks/             → Cucumber lifecycle (Before / After)
├── ❓  questions/         → What the actor observes and verifies
├── 🏃  runners/           → JUnit 5 suite configuration
├── 🔗  stepdefinitions/   → Gherkin ↔ Screenplay glue
├── ✅  tasks/             → High-level user actions (one task = one responsibility)
├── 🖥️  ui/                → Element locators only (no logic)
└── 🔧  util/              → Shared constants and helpers

📦 src/test/resources/
└── 📂 features/
    └── 📄 registro.feature   → Business-readable Gherkin scenarios
```

### 🔄 Screenplay Flow

```
┌─────────────┐     performs     ┌─────────────┐     using     ┌─────────────┐
│    Actor    │ ──────────────▶  │    Task     │ ───────────▶  │  UI Layer   │
│  (Customer) │                  │ (SelectTable│               │ (Locators)  │
└─────────────┘                  │  AddToCart) │               └─────────────┘
       │                         └─────────────┘
       │  asks
       ▼
┌─────────────┐
│  Question   │  ◀── verifies expected outcome
│(Confirmation│
│   Screen)   │
└─────────────┘
```

### 📋 Layer Responsibilities

| Layer | Answers | Example |
|---|---|---|
| `tasks/` | **What** does the actor do? | `SelectTable`, `ConfirmOrder` |
| `ui/` | **Where** are the elements? | `MenuPage.ITEM_BUTTON` |
| `questions/` | **What** does the actor verify? | `TheConfirmationScreen.isVisible()` |
| `stepdefinitions/` | How do steps map to actions? | `@When` → `actor.attemptsTo(...)` |
| `hooks/` | Setup / teardown per scenario | `actor = Actor.named("Customer")` |
| `runners/` | How is the suite configured? | `@ConfigurationParameter` |

---

## 🛠️ Tech Stack

| Tool | Version |
|---|:---:|
| ☕ Java | 16 |
| 🎭 Serenity BDD | 4.2.22 |
| 🥒 Cucumber | 7.20.1 |
| 🧪 JUnit 5 | 5.11.4 |
| 🐘 Gradle | Wrapper included |
| 🌐 Browser driver | Configured via `serenity.conf` |

---

## 🚀 Project Setup

### Prerequisites

- Java 16+
- Google Chrome installed
- ChromeDriver matching your Chrome version

### Clone the repository

```bash
git clone https://github.com/nico-salsa/PedidosRestaurante-E2ETesting-Screenplay.git
cd PedidosRestaurante-E2ETesting-Screenplay
```

---

## ▶️ Running the Tests

**Linux / Mac**
```bash
./gradlew clean test aggregate
```

**Windows**
```bash
gradlew.bat clean test aggregate
```

**Run by tag**
```bash
./gradlew clean test -Dcucumber.filter.tags="@smoke" aggregate
```

---

## 📊 Serenity Report

After execution, the report is generated at:

```
target/site/serenity/index.html
```

Open it in any browser to view scenario results, screenshots, and step-by-step execution details.

---

## 🌿 Branching Strategy — Gitflow

```
main ──────────────────────────────────────────▶  (protected, PR required)
  └── develop ──────────────────────────────────▶  (integration branch)
        ├── feature/login-flow
        ├── feature/table-selection
        └── feature/order-confirmation
```

| Branch | Purpose |
|---|---|
| `main` | Stable deliverable — merge via PR only |
| `develop` | Ongoing integration |
| `feature/*` | One branch per feature |

---

## 📦 Package Convention

All Java classes use the base package:

```
com.sofka.pedidos
```
