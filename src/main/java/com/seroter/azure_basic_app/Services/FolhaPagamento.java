package com.seroter.azure_basic_app.Services;

import com.seroter.azure_basic_app.Entities.Funcionario;

import java.sql.SQLOutput;

public class FolhaPagamento {
    //so pra iniciar algum funcionario
    Funcionario func = new Funcionario(1L,"Mario", 1500.00, 2, 0.0, 0.0, true);

    private Double inss = calculoINSS(func.getSalarioBruto());
    private Double irrf = calculoIRRF();
    private Double valeTransporte = func.getValeTransporte() ? func.getSalarioBruto() * 0.06 : 0.0;
    private Double salarioLiquido = func.getSalarioBruto() - (inss + irrf + valeTransporte);
    private Integer dependentes = func.getDependentes();



    public Double calculoINSS(Double salario){
        /*
                tabela atual do inss 17/03/2025
                Até 1.518,00	7,5%
                De 1.518,01 até 2.793,88	9,0%
                De 2.793,89 até 4.190,83	12,0%
                De 4.190,84 até 8.157,41	14,0%
         */

        if(salario <= 1518.00){
            return salario * 0.075;
        }
        if(salario <= 2793.88){
            return salario * 0.09;
        }
        if(salario <= 4190.83){
            return salario * 0.12;
        }
        else{
            return salario * 0.14;
        }
    }

    public Double calculoIRRF(){
        /*
            tabela atual do irrf 17/03/2025
            Até 2.259,20	            Isento	  0,00
            De 2.259,21 até 2.826,65	7,5%	169,44
            De 2.826,66 até 3.751,05	15%	    381,44
            De 3.751,06 até 4.664,68	22,5%	662,77
            Acima de 4.664,68	        27,5%	896,00
        */
        double baseCalculo = func.getSalarioBruto() - inss - valeTransporte - (dependentes * 189.59);

        if(baseCalculo <= 2259.20){
            return 0.0;
        }
        if(baseCalculo <= 2826.65){
            return (baseCalculo * 0.075) - 169.44;
        }
        if(baseCalculo <= 3751.05){
            return (baseCalculo * 0.15) - 381.44;
        }
        if(baseCalculo <= 4664.68){
            return (baseCalculo * 0.225) - 662.77;
        }
        else{
            return (baseCalculo * 0.275) - 896.00;
        }

    }

    public void mostrarHolerite(){
        System.out.println("------- HOLERITE -------");
        System.out.println("                        ");
        System.out.printf("SALARIO BRUTO = %.2f%n",func.getSalarioBruto());
        System.out.printf("INSS = -%.2f%n", inss);
        System.out.printf("IRRF = -%.2f%n", irrf);
        System.out.printf("Vale transporte = -%.2f%n", valeTransporte);
        System.out.println("------------------------");
        System.out.printf("SALARIO LIQUIDO = %.2f%n", salarioLiquido);
    }





}
