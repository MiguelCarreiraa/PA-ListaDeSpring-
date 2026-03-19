package com.Carreira.PA_ListaDeSpring.repositories;

import com.Carreira.PA_ListaDeSpring.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
