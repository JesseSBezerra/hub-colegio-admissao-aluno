package br.com.jdsb.hubcolegioadmissaoaluno.application.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CandidatoDTO {
    private String nome;
    private LocalDate dataNascimento;
    private String curso;
    private BigDecimal valorMensalidade;
    private String periodo;
    private String turno;
    private String cpf;
    private String codigoMatricula;
}
