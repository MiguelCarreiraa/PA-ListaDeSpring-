package com.Carreira.PA_ListaDeSpring.services;

import com.Carreira.PA_ListaDeSpring.models.ClienteModel;
import com.Carreira.PA_ListaDeSpring.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }
    public ClienteModel criar(ClienteModel cliente) {
        return clienteRepository.save(cliente);

    }

    public Optional<ClienteModel> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public ClienteModel atualizar(Long id,ClienteModel cliente) {
        ClienteModel model =  clienteRepository.findById(id).get();
        model.setNome(cliente.getNome());
        model.setEmail(cliente.getEmail());
        model.setTelefone(cliente.getTelefone());
        return clienteRepository.save(model);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

}
