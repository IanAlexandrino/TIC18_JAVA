package com.leilao.leilao.repository;

import com.leilao.leilao.model.Concorrente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConcorrenteRepository extends JpaRepository<Concorrente, Integer> {

    List<Concorrente> findByNome(String nome);

}
