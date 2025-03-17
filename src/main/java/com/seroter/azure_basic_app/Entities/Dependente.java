package com.seroter.azure_basic_app.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Dependente extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    private Funcionario funcionarioId;
    private LocalDate dataNascimento;

    public Dependente(String nome, String cpf, Funcionario funcionarioId, LocalDate dataNascimento) {
        super(nome, cpf);
        this.funcionarioId = funcionarioId;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Funcionario getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Funcionario funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
