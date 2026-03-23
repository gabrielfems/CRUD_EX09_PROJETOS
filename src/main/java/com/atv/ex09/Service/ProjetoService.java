package com.atv.ex09.Service;

import org.springframework.stereotype.Service;

import com.atv.ex09.Model.Projeto;
import com.atv.ex09.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    public List<Projeto> listaProjetos() {
        return repository.findAll();
    }

    public Optional<Projeto> exibeProjeto(Long id) {
        return repository.findById(id);
    }

    public Projeto criarProjeto(Projeto projeto) {
        return repository.save(projeto);
    }

    public void deletarProjeto(Long id) {
        repository.deleteById(id);
    }
}
