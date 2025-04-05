package br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.out;


import br.com.jdsb.hubcolegioadmissaoaluno.domain.model.Candidato;

public interface CandidatoRepositoryPort {
    void salvar(Candidato candidato);
}


