package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.entity;

import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.converter.UUIDConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@DynamoDBTable(tableName = "tbl_candidato")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandidatoDocument {

    @DynamoDBHashKey(attributeName = "id")
    @DynamoDBTypeConverted(converter = UUIDConverter.class)
    private UUID id;

    @DynamoDBAttribute(attributeName = "nome")
    private String nome;

    @DynamoDBAttribute(attributeName = "dataNascimento")
    private String dataNascimento;

    @DynamoDBAttribute(attributeName = "curso")
    private String curso;

    @DynamoDBAttribute(attributeName = "valorMensalidade")
    private BigDecimal valorMensalidade;

    @DynamoDBAttribute(attributeName = "periodo")
    private String periodo;

    @DynamoDBAttribute(attributeName = "turno")
    private String turno;

    @DynamoDBAttribute(attributeName = "cpf")
    private String cpf;

    @DynamoDBAttribute(attributeName = "codigoMatricula")
    private String codigoMatricula;
}
