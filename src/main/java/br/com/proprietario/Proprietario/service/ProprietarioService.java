package br.com.proprietario.Proprietario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.proprietario.Proprietario.entity.Proprietario;
import br.com.proprietario.Proprietario.repository.ProprietarioRepository;

@Service
public class ProprietarioService {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public Proprietario save(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public List<Proprietario> findAll() {
        return proprietarioRepository.findAll();
    }

    public void deleteById(Integer id) {
        proprietarioRepository.deleteById(id);
    }

    public Proprietario findById(Integer id) {
        return proprietarioRepository.findById(id).orElse(null);
    }
}
