package br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.in;

import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;

public interface CandidatoUseCase {
    void cadastrar(Candidato candidato);
}
