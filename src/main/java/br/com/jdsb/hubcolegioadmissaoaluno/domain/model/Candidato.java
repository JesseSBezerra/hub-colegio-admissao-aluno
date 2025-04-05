package br.com.jdsb.hubcolegioadmissaoaluno.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {
    private String nome;
    private LocalDate dataNascimento;
    private String curso;
    private BigDecimal valorMensalidade;
    private String periodo;
    private String turno;
    private String cpf;
    private String codigoMatricula;
}
