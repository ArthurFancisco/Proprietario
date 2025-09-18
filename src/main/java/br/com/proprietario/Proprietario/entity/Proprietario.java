package br.com.proprietario.Proprietario.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProprietario;

    @Column(nullable = false)
    private String nomeProprietario;

    @Column(nullable = false, unique = true, length = 14)
    private String cpfProprietario;

    @Column(nullable = false, length = 12)
    private String rgProprietario;

    @Column(nullable = false)
    private String categoriaProprietario;

    // Construtor vazio
    public Proprietario() {
    }

    // Construtor com argumentos (opcional)
    public Proprietario(String nomeProprietario, String cpfProprietario, String rgProprietario, String categoriaProprietario) {
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.rgProprietario = rgProprietario;
        this.categoriaProprietario = categoriaProprietario;
    }

    // Getters e Setters
    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public String getRgProprietario() {
        return rgProprietario;
    }

    public void setRgProprietario(String rgProprietario) {
        this.rgProprietario = rgProprietario;
    }

    public String getCategoriaProprietario() {
        return categoriaProprietario;
    }

    public void setCategoriaProprietario(String categoriaProprietario) {
        this.categoriaProprietario = categoriaProprietario;
    }

    public List<Proprietario> findAll() {
        return null;
    }
} 
