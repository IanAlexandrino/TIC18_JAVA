package com.leilao.leilao.controller;

import com.leilao.leilao.controller.dto.ConcorrenteDTO;
import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.repository.ConcorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaConcorrentesController {

    @Autowired
    private ConcorrenteRepository concorrenteRepository;

    @RequestMapping("/concorrentes/")
    public List<ConcorrenteDTO> retornaConcorrentes(String name) {

        List<Concorrente> listaConcorrentes = (ArrayList<Concorrente>) concorrenteRepository.findAll();
        List<ConcorrenteDTO> lista = new ArrayList<ConcorrenteDTO>();
        for (Concorrente concorrente : listaConcorrentes){

            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            lista.add(concorrenteDTO);

        }
        return lista;
    }

}
