import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        double nota3 = teclado.nextDouble();

        double total = (nota1 + nota2 + nota3) / 3;

        System.out.println("MÉDIA CALCULADA!\n=============================");
        System.out.println("A média do aluno é: " + total);

        if(total>=7){
            System.out.println("\nSituação do aluno: Aprovado");
        }else{
            System.out.println("\nSituação do aluno: Reprovado");
        }
        System.out.println("=============================");
        teclado.close();
    }

}
