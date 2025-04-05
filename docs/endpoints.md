# 🧪 Endpoints REST

A aplicação expõe os seguintes endpoints RESTful:

## 📥 POST `/api/candidatos`

Cadastrar um novo candidato e publicá-lo no Kafka e MongoDB.

### Requisição (JSON)
```json
{
  "nome": "Ana Beatriz",
  "dataNascimento": "2005-09-12",
  "curso": "Engenharia de Software",
  "valorMensalidade": 1850.75,
  "periodo": "Noturno",
  "turno": "2º",
  "cpf": "123.456.789-00",
  "codigoMatricula": "MAT202412345"
}
```

### Resposta:
- `201 Created` – em caso de sucesso.
- `400 Bad Request` – se houver falha na validação.
