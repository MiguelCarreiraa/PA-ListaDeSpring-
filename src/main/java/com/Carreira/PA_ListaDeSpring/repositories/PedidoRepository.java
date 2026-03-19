package com.Carreira.PA_ListaDeSpring.repositories;

import com.Carreira.PA_ListaDeSpring.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
