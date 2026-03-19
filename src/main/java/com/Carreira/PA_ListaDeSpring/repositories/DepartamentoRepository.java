package com.Carreira.PA_ListaDeSpring.repositories;

import com.Carreira.PA_ListaDeSpring.models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}
