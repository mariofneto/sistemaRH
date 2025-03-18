package com.seroter.azure_basic_app.Entities;

public class Funcionario {
    private Long id;
    private String nome;
    private Double salarioBruto;
    private Integer dependentes;
    private Double horasExtras;
    private Double faltas;
    private Boolean valeTransporte;

    public Funcionario(Long id, String nome, Double salarioBruto, Integer dependentes, Double horasExtras, Double faltas, Boolean valeTransporte) {
        this.id = id;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.dependentes = dependentes;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
        this.valeTransporte = valeTransporte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double getFaltas() {
        return faltas;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }

    public Boolean getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(Boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
}
