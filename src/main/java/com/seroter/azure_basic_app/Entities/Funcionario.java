package com.seroter.azure_basic_app.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double salarioLiquido;

    public Funcionario(String nome, String cpf, Double salarioLiquido) {
        super(nome, cpf);
        this.salarioLiquido = salarioLiquido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}
