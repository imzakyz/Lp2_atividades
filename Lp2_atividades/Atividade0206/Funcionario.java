package Atividade0206;

import java.time.LocalDate;

public class Funcionario {


    public String nome;
    public String cpf;
    public String numRG;
    public LocalDate dataContratacao;


    private double salario;
    private double salarioBase;
    private double horasTrabalhadas;
    private int matricula;


    private static int geraMatricula = 0;


    public Funcionario(String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;


        geraMatricula++;
        this.matricula = geraMatricula;
        this.dataContratacao = LocalDate.now();
    }


    public void calculaSalario() {
        Calculo calc = new Calculo();
        calc.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calc.getTotalSalario();
    }


    public void imprimeDados() {
        System.out.println("=== Dados do Funcionário ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.numRG);
        System.out.println("Data de Contratação: " + this.dataContratacao);
        System.out.println("Salário Calculado: R$ " + this.salario);
        System.out.println("---------------------------");
    }
}