package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.mapper;

import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.entity.CandidatoDocument;
import org.springframework.stereotype.Component;

@Component
public class CandidatoDocumentMapper {

    public CandidatoDocument toDocument(Candidato candidato) {
        return CandidatoDocument.builder()
                .nome(candidato.getNome())
                .cpf(candidato.getCpf())
                .dataNascimento(candidato.getDataNascimento().toString())
                .codigoMatricula(candidato.getCodigoMatricula())
                .valorMensalidade(candidato.getValorMensalidade())
                .periodo(candidato.getPeriodo())
                .turno(candidato.getTurno())
                .curso(candidato.getCurso())
                .build();
    }
}
