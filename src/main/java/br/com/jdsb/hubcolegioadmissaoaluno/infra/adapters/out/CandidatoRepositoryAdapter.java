package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out;


import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.out.CandidatoRepositoryPort;
import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.entity.CandidatoDocument;
import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.mapper.CandidatoDocumentMapper;
import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.mongo.repository.CandidatoDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CandidatoRepositoryAdapter implements CandidatoRepositoryPort {
    private final CandidatoDocumentMapper mapper;
    private final CandidatoDocumentRepository repository;

    @Override
    public void salvar(Candidato candidato) {
        System.out.println("Salvando candidato no banco: " + candidato);
        CandidatoDocument document = mapper.toDocument(candidato);
        document.setId(UUID.randomUUID());
        repository.save(document);
    }
}
