package com.leilao.leilao.controller;

import com.leilao.leilao.controller.dto.ConcorrenteDTO;
import com.leilao.leilao.controller.form.ConcorrenteForm;
import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.repository.ConcorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/concorrente/")
public class ConcorrenteController {

    @Autowired
    private ConcorrenteRepository concorrenteRepository;

    @GetMapping
    public List<ConcorrenteDTO> retornaConcorrentes(String name) {

        List<Concorrente> listaConcorrentes = (ArrayList<Concorrente>) concorrenteRepository.findAll();
        List<ConcorrenteDTO> lista = new ArrayList<ConcorrenteDTO>();
        for (Concorrente concorrente : listaConcorrentes){

            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            lista.add(concorrenteDTO);

        }
        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listaConcorrentesId(@PathVariable Integer id){

        if (id == null){

            return ResponseEntity.badRequest().build();

        }

        try{

            Concorrente concorrente = concorrenteRepository.getReferenceById(id);
            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            return ResponseEntity.ok(concorrenteDTO);

        } catch (Exception e){

            return ResponseEntity.notFound().build();

        }

    }

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

    @PutMapping("/{id}")
    public ResponseEntity<?> updateConcorrente(@PathVariable Integer id,
                                               @RequestBody ConcorrenteForm CF){

        if (id == null){

            return ResponseEntity.badRequest().build();

        }

        try{

            Concorrente concorrente = concorrenteRepository.getReferenceById(id);
            concorrente.setNome(CF.getNome());
            concorrente.setCpf(CF.getCpf());
            concorrente.setListaLances(CF.getListaLances());
            concorrenteRepository.save(concorrente);
            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);

            return ResponseEntity.ok(concorrenteDTO);

        } catch (Exception e){

            return ResponseEntity.notFound().build();

        }

    }

}
