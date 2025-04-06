package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.out.kafka;

import br.com.jdsb.hub.avro.CandidatoEvent;
import br.com.jdsb.hubcolegioadmissaoaluno.application.mapper.CandidatoAvroMapper;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.out.PublicadorKafkaPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PublicadorKafkaPortImpl implements PublicadorKafkaPort {

    private final KafkaTemplate<String, CandidatoEvent> kafkaTemplate;
    private final CandidatoAvroMapper mapper;

    private static final String TOPIC = "topic-hub.candidato.admissao";

    @Override
    public void publicar(Candidato candidato) {
        CandidatoEvent evento = mapper.toAvro(candidato);
        kafkaTemplate.send(TOPIC, evento);
        log.info("✅ Evento publicado no tópico [{}]: {}", TOPIC, evento);
    }
}