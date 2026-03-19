package com.Carreira.PA_ListaDeSpring.controllers;

import com.Carreira.PA_ListaDeSpring.models.ClienteModel;
import com.Carreira.PA_ListaDeSpring.models.FornecedorModel;
import com.Carreira.PA_ListaDeSpring.repositories.FornecedorRepository;
import com.Carreira.PA_ListaDeSpring.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public List<FornecedorModel> findAll(){
        return fornecedorService.findAll();
    }

    @PostMapping
    public FornecedorModel criarCliente(@RequestBody FornecedorModel clienteModel){
        return fornecedorService.criar(clienteModel);
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel> buscarFornecedor(@PathVariable Long id){
        return fornecedorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public FornecedorModel atualizarFornecedor(@PathVariable Long id, @RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.atualizar(id, fornecedorModel);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id){
        fornecedorService.deletar(id);
    }
}
