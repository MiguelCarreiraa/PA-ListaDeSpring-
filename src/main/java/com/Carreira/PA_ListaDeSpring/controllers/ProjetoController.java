package com.Carreira.PA_ListaDeSpring.controllers;

import com.Carreira.PA_ListaDeSpring.models.ProjetoModel;
import com.Carreira.PA_ListaDeSpring.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<ProjetoModel> findAll(){
        return projetoService.findAll();
    }

    @PostMapping
    public ProjetoModel criarProjeto(@RequestBody ProjetoModel projetoModel){
        return projetoService.criar(projetoModel);
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel> bucarProjeto(@PathVariable Long id){
        return projetoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ProjetoModel atualizarCProjeto(@PathVariable Long id, @RequestBody ProjetoModel projetoModel){
        return projetoService.atualizar(id, projetoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id){
        projetoService.deletar(id);
    }

}
