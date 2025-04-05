package br.com.jdsb.hubcolegioadmissaoaluno.application.service;

import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.in.CandidatoUseCase;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.out.CandidatoRepositoryPort;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.out.PublicadorKafkaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CadastrarCandidatoService implements CandidatoUseCase {

    private final PublicadorKafkaPort publicadorKafkaPort;
    private final CandidatoRepositoryPort candidatoRepositoryPort;

    @Override
    public void cadastrar(Candidato candidato) {
        candidatoRepositoryPort.salvar(candidato); // Salva no banco
        publicadorKafkaPort.publicar(candidato);   // Publica no Kafka
    }
}
