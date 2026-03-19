package com.Carreira.PA_ListaDeSpring.repositories;

import com.Carreira.PA_ListaDeSpring.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}

