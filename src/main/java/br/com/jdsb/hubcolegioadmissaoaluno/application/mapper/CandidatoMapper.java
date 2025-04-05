package br.com.jdsb.hubcolegioadmissaoaluno.application.mapper;

import br.com.jdsb.hubcolegioadmissaoaluno.application.dto.CandidatoDTO;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import org.springframework.stereotype.Component;

@Component
public class CandidatoMapper {

    public Candidato toDomain(CandidatoDTO dto) {
        return Candidato.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .codigoMatricula(dto.getCodigoMatricula())
                .valorMensalidade(dto.getValorMensalidade())
                .periodo(dto.getPeriodo())
                .turno(dto.getTurno())
                .curso(dto.getCurso())
                .build();
    }
}
