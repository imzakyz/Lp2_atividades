import java.util.Scanner;

public class Questao03 {
    public  static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();

        if(idade>=18){
            System.out.println("Aceito");
        }else{
            System.out.println("Negado");
        }

        teclado.close();
    }
}
