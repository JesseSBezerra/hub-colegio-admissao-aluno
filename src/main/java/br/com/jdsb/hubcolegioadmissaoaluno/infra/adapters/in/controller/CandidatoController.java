package br.com.jdsb.hubcolegioadmissaoaluno.infra.adapters.in.controller;


import br.com.jdsb.hubcolegioadmissaoaluno.application.dto.CandidatoDTO;
import br.com.jdsb.hubcolegioadmissaoaluno.application.mapper.CandidatoMapper;
import br.com.jdsb.hubcolegioadmissaoaluno.domain.ports.in.CandidatoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidatos")
@RequiredArgsConstructor
public class CandidatoController {

    private final CandidatoUseCase candidatoUseCase;
    private final CandidatoMapper candidatoMapper;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody CandidatoDTO dto) {
        candidatoUseCase.cadastrar(candidatoMapper.toDomain(dto));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
