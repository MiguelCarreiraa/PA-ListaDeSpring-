package com.Carreira.PA_ListaDeSpring.services;

import com.Carreira.PA_ListaDeSpring.models.FornecedorModel;
import com.Carreira.PA_ListaDeSpring.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> findAll() {
        return fornecedorRepository.findAll();
    }

    public FornecedorModel criar(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }

    public Optional<FornecedorModel> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public FornecedorModel atualizar(Long id,FornecedorModel fornecedorModel) {
        FornecedorModel model = fornecedorRepository.findById(id).get();
        model.setNomeFantasiaFornecedor(fornecedorModel.getNomeFantasiaFornecedor());
        model.setCnpjFornecedor(fornecedorModel.getCnpjFornecedor());
        model.setContatoFornecedor(fornecedorModel.getContatoFornecedor());
        return fornecedorRepository.save(model);
    }
    public void deletar(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
