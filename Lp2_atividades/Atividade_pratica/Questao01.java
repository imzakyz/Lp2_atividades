import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        // Escrito no JDE 26, não é necessário o 'public static void'

        Scanner teclado = new Scanner(System.in);

        int horasTrabalho;
        double salario;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalho = teclado.nextInt();

        salario = horasTrabalho * 20.0;

        System.out.println("O salário equivalente à quantidade de horas:" + salario);

        teclado.close();

    }
}