package com.Carreira.PA_ListaDeSpring.controllers;

import com.Carreira.PA_ListaDeSpring.models.ClienteModel;
import com.Carreira.PA_ListaDeSpring.repositories.ClienteRepository;
import com.Carreira.PA_ListaDeSpring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> findAll(){
        return clienteService.findAll();
    }

    @PostMapping
    public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel){
        return clienteService.criar(clienteModel);
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel> buscarCliente(@PathVariable Long id){
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ClienteModel atualizarCliente(@PathVariable Long id, @RequestBody ClienteModel clienteModel){
        return clienteService.atualizar(id, clienteModel);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteService.deletar(id);
    }
}
