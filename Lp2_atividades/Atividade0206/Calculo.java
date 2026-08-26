package Atividade0206;

public class Calculo{
    // variavel para guardar o total do salário
    private double totalSalario;

    // método para calcular o salario
    // as variaveis dentro do metodo são locais e não podem ser acessadas fora do método
    protected void calculaSalario(double salarioBase, double horasTrabalhadas){
        // o this é usado para referenciar a variavel da classe
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    // método para retornar o total do salário
    public double getTotalSalario(){
        return this.totalSalario;
    }

}