package com.leilao.leilao.controller;

import com.leilao.leilao.controller.dto.ConcorrenteDTO;
import com.leilao.leilao.controller.form.ConcorrenteForm;
import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.repository.ConcorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/concorrentes/")
public class ConcorrenteController {

    @Autowired
    private ConcorrenteRepository concorrenteRepository;

    @PostMapping
    public ResponseEntity<ConcorrenteDTO> inserir
            (@RequestBody ConcorrenteForm CF,
             UriComponentsBuilder UB){

        Concorrente concorrente = CF.criaConcorrente();
        concorrenteRepository.save(concorrente);
        ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
        UB.path("/concorrentes/{id}");
        URI uri = UB.buildAndExpand(concorrente.getId()).toUri();

        return ResponseEntity.created(uri).body(concorrenteDTO);
    }
}
