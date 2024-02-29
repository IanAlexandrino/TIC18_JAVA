package com.leilao.leilao.controller;

import com.leilao.leilao.controller.dto.LanceDTO;
import com.leilao.leilao.controller.form.LanceForm;
import com.leilao.leilao.model.Lance;
import com.leilao.leilao.repository.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lance/")
public class LanceController {

    @Autowired
    private LanceRepository lanceRepository;

    @GetMapping
    public List<LanceDTO> retornaLances() {

        List<Lance> listaLances = (ArrayList<Lance>) lanceRepository.findAll();
        List<LanceDTO> lista = new ArrayList<LanceDTO>();
        for (Lance lance : listaLances) {

            LanceDTO lanceDTO = new LanceDTO(lance);
            lista.add(lanceDTO);

        }
        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listaLancesId(@PathVariable Integer id) {

        if (id == null) {

            return ResponseEntity.badRequest().build();

        }

        try {

            Lance lance = lanceRepository.getReferenceById(id);
            LanceDTO lanceDTO = new LanceDTO(lance);
            return ResponseEntity.ok(lanceDTO);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();

        }

    }

    @PostMapping
    public ResponseEntity<LanceDTO> inserir
            (@RequestBody LanceForm LF,
             UriComponentsBuilder UB) {

        Lance lance = LF.criaLance();
        lanceRepository.save(lance);
        LanceDTO lanceDTO = new LanceDTO(lance);
        UB.path("/lance/{id}");
        URI uri = UB.buildAndExpand(lance.getId()).toUri();

        return ResponseEntity.created(uri).body(lanceDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateLance(@PathVariable Integer id,
                                          @RequestBody LanceForm LF) {

        if (id == null) {

            return ResponseEntity.badRequest().build();

        }

        try {

            Lance lance = lanceRepository.getReferenceById(id);
            lance.setValor(LF.getValor());
            lance.setLeilao(LF.getLeilao());
            lance.setConcorrente(LF.getConcorrente());
            lanceRepository.save(lance);
            LanceDTO lanceDTO = new LanceDTO(lance);

            return ResponseEntity.ok(lanceDTO);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();

        }

    }

    /*@DeleteMapping("/{id}")
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

    }*/

}
