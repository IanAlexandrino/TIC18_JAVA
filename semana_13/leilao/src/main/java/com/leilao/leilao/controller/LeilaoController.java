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
        for (Leilao leilao : listaLeiloes) {

            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            lista.add(leilaoDTO);

        }
        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listaLeiloesId(@PathVariable Integer id) {

        if (id == null) {

            return ResponseEntity.badRequest().build();

        }

        try {

            Leilao leilao = leilaoRepository.getReferenceById(id);
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            return ResponseEntity.ok(leilaoDTO);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();

        }

    }

    @PostMapping
    public ResponseEntity<LeilaoDTO> inserir
            (@RequestBody LeilaoForm LF,
             UriComponentsBuilder UB) {

        Leilao leilao = LF.criaLeilao();
        leilaoRepository.save(leilao);
        LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
        UB.path("/leilao/{id}");
        URI uri = UB.buildAndExpand(leilao.getId()).toUri();

        return ResponseEntity.created(uri).body(leilaoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateLeilao(@PathVariable Integer id,
                                          @RequestBody LeilaoForm LF) {

        if (id == null) {

            return ResponseEntity.badRequest().build();

        }

        try {

            Leilao leilao = leilaoRepository.getReferenceById(id);
            leilao.setDescricao(LF.getDescricao());
            leilao.setValorMinimo(LF.getValorMinimo());
            leilao.setStatus(LF.getStatus());
            leilao.setListaLances(LF.getListaLances());
            leilaoRepository.save(leilao);
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);

            return ResponseEntity.ok(leilaoDTO);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();

        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaLeilao(@PathVariable Integer id) {

        if (id == null) {

            return ResponseEntity.badRequest().build();

        }

        try {

            Leilao leilao = leilaoRepository.getReferenceById(id);
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            leilaoRepository.delete(leilao);


            return ResponseEntity.ok(leilaoDTO);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();

        }

    }

}

