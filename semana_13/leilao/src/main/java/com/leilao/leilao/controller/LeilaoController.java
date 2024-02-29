package com.leilao.leilao.controller;

import com.leilao.leilao.controller.dto.ConcorrenteDTO;
import com.leilao.leilao.controller.dto.LeilaoDTO;
import com.leilao.leilao.controller.form.ConcorrenteForm;
import com.leilao.leilao.controller.form.LeilaoForm;
import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.model.Leilao;
import com.leilao.leilao.repository.ConcorrenteRepository;
import com.leilao.leilao.repository.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/leilao/")
public class LeilaoController {

    @Autowired
    private LeilaoRepository leilaoRepository;

    @GetMapping
    public List<LeilaoDTO> retornaLeiloes() {

        List<Leilao> listaLeiloes = (ArrayList<Leilao>) leilaoRepository.findAll();
        List<LeilaoDTO> lista = new ArrayList<LeilaoDTO>();
        for (Leilao leilao : listaLeiloes){

            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            lista.add(leilaoDTO);

        }
        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listaLeiloesId(@PathVariable Integer id){

        if (id == null){

            return ResponseEntity.badRequest().build();

        }

        try{

            Leilao leilao = leilaoRepository.getReferenceById(id);
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            return ResponseEntity.ok(leilaoDTO);

        } catch (Exception e){

            return ResponseEntity.notFound().build();

        }

    }

    @PostMapping
    public ResponseEntity<LeilaoDTO> inserir
            (@RequestBody LeilaoForm LF,
             UriComponentsBuilder UB){

        Leilao leilao = LF.criaLeilao();
        leilaoRepository.save(leilao);
        LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
        UB.path("/leilao/{id}");
        URI uri = UB.buildAndExpand(leilao.getId()).toUri();

        return ResponseEntity.created(uri).body(leilaoDTO);
    }

    /*@PutMapping("/{id}")
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

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaConcorrente(@PathVariable Integer id){

        if (id == null){

            return ResponseEntity.badRequest().build();

        }

        try {

            Concorrente concorrente = concorrenteRepository.getReferenceById(id);
            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            concorrenteRepository.delete(concorrente);


            return ResponseEntity.ok(concorrenteDTO);

        }catch (Exception e){

            return ResponseEntity.notFound().build();

        }*/

    }


