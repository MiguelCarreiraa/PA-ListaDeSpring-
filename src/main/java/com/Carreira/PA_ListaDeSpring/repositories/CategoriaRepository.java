package com.Carreira.PA_ListaDeSpring.repositories;


import com.Carreira.PA_ListaDeSpring.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long> {
}
