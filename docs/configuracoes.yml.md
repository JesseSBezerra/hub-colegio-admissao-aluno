# ⚙️ application.yml – Configurações

## Kafka

```yaml
spring:
  kafka:
    bootstrap-servers: localhost:9092
    properties:
      schema.registry.url: http://localhost:8081
    producer:
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: io.confluent.kafka.serializers.KafkaAvroSerializer
```

## MongoDB

```yaml
spring:
  data:
    mongodb:
      uri: mongodb://localhost:27017/hub-colegio
```

## DynamoDB

```yaml
amazon:
  dynamodb:
    endpoint: http://localhost:8000
    region: us-east-1
```
