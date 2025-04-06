package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.dynamo.repository;

import br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.dynamo.entity.CandidatoDocument;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@EnableScan
public interface CandidatoDocumentRepository extends CrudRepository<CandidatoDocument, UUID> {
}
