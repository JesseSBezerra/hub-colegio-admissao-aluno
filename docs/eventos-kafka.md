# 📡 Eventos Kafka (Avro)

Este projeto utiliza **Apache Avro** para garantir a tipagem e evolução segura dos eventos trafegados via Kafka.

## 🎯 Tópico Kafka utilizado
```
hub.candidato.admissao
```

## 📄 Schema Avro: `CandidatoEvent`

```json
{
  "type": "record",
  "name": "CandidatoEvent",
  "namespace": "br.com.jdsb.hub.avro",
  "fields": [
    { "name": "nome", "type": "string" },
    { "name": "dataNascimento", "type": "string" },
    { "name": "curso", "type": "string" },
    { "name": "valorMensalidade", "type": { "type": "bytes", "logicalType": "decimal", "precision": 10, "scale": 2 } },
    { "name": "periodo", "type": "string" },
    { "name": "turno", "type": "string" },
    { "name": "cpf", "type": "string" },
    { "name": "codigoMatricula", "type": "string" }
  ]
}
```

## ✅ Publicação

Os eventos são publicados usando:
- `KafkaTemplate<String, CandidatoEvent>`
- Serializador: `KafkaAvroSerializer`
- Registry: `Confluent Schema Registry`
