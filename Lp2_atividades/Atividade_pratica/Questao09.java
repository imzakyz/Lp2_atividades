import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorHoraAula;
        double horasTrabalhadas;
        double percentualInss;
        double salarioBruto;
        double salarioLiquido;

        System.out.println("Digite o valor da hora aula:");
        valorHoraAula = teclado.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas:");
        horasTrabalhadas = teclado.nextDouble();

        System.out.println("Digite o percentual de desconto do INSS (ex: 11):");
        percentualInss = teclado.nextDouble();

        salarioBruto = valorHoraAula * horasTrabalhadas;
        salarioLiquido = salarioBruto - (salarioBruto * (percentualInss / 100));

        System.out.println("Salario Bruto: R$ " + salarioBruto);
        System.out.println("Salario Liquido: R$ " + salarioLiquido);

        teclado.close();
    }

}
