import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double v1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor:");
        double v2 = teclado.nextDouble();

        double somaInicial = v1 + v2;


        double resultadoFinal = ajustarResultado(somaInicial);

        System.out.println("O resultado final ajustado é: " + resultadoFinal);

        teclado.close();
    }

    public static double ajustarResultado(double soma) {
        if (soma >= 10) {
            return soma + 5;
        } else {
            return soma - 7;
        }
    }


}

