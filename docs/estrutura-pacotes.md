# 📦 Estrutura de Pacotes

## Domain
- `model` → Entidades puras do domínio
- `ports.in` → Interfaces de entrada (casos de uso)
- `ports.out` → Interfaces de saída (Kafka, Mongo, etc)

## Application
- `service` → Implementações dos casos de uso
- `dto`, `mapper` → Conversões entre camadas

## Infra
- `adapters.in.controller` → Controllers REST
- `adapters.out.kafka` → Publicadores Kafka
- `adapters.out.mongo` → Repositórios MongoDB
- `config` → Configurações do Spring Boot (Kafka, Mongo, etc)
