import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = teclado.nextDouble();
        System.out.println("Digite o segundo valor:");
        double valor2 = teclado.nextDouble();

        double soma = calcularSoma(valor1, valor2);

        if (soma > 10) {
            System.out.println("Resultado: " + soma);
        }

        teclado.close();

    }
    public static double calcularSoma(double a, double b) {
        return a + b;
    }

}
