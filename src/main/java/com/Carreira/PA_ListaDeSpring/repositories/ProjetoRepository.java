package com.Carreira.PA_ListaDeSpring.repositories;

import com.Carreira.PA_ListaDeSpring.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<PedidoModel,Long> {
}
