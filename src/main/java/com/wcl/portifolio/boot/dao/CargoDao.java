package com.wcl.portifolio.boot.dao;

import java.util.List;

import com.wcl.portifolio.boot.domain.Cargo;
import com.wcl.portifolio.boot.util.PaginacaoUtil;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
    
    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
