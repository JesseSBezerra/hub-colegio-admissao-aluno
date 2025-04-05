# 🧱 Arquitetura Hexagonal (Ports & Adapters)

Este projeto adota a **Arquitetura Hexagonal**, também conhecida como **Ports & Adapters**.

## 🎯 Objetivo
Separar as responsabilidades em camadas bem definidas, isolando o domínio do negócio de detalhes técnicos como banco de dados, mensageria e APIs externas.

---

## 🧩 Camadas principais

### 1. Domain
- Contém os modelos de domínio (`Candidato`) e as interfaces das portas (`ports.in` e `ports.out`).
- Nenhuma dependência externa.

### 2. Application
- Implementa os casos de uso.
- Interage com o domínio e com as portas (interfaces).
- Ex: `CadastrarCandidatoService`.

### 3. Infra (Adapters)
- Implementações concretas das portas.
- Comunicação com banco de dados, Kafka, Avro, Mongo, etc.

---

## 🔄 Fluxo de cadastro

```
Controller (adapter in) → UseCase (application) → Kafka + Mongo (adapters out)
```

---

## ✅ Benefícios
- Baixo acoplamento
- Alta testabilidade
- Substituição simples de infraestrutura (Kafka → Rabbit, Mongo → PostgreSQL, etc)
