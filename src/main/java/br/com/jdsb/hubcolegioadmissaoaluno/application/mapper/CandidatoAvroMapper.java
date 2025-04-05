package br.com.jdsb.hubcolegioadmissaoaluno.application.mapper;

import br.com.jdsb.hub.avro.CandidatoEvent;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import org.springframework.stereotype.Component;

@Component
public class CandidatoAvroMapper {

    public CandidatoEvent toAvro(Candidato candidato) {
        return CandidatoEvent.newBuilder()
                .setNome(candidato.getNome())
                .setDataNascimento(candidato.getDataNascimento().toString()) // mapeamento manual de LocalDate para string
                .setCurso(candidato.getCurso())
                .setValorMensalidade(candidato.getValorMensalidade())
                .setPeriodo(candidato.getPeriodo())
                .setTurno(candidato.getTurno())
                .setCpf(candidato.getCpf())
                .setCodigoMatricula(candidato.getCodigoMatricula())
                .build();
    }
}