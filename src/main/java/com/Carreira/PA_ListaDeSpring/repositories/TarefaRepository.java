package com.Carreira.PA_ListaDeSpring.repositories;


import com.Carreira.PA_ListaDeSpring.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}
