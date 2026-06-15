import java.util.Scanner;

public class Questão08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Digite o raio: ");
        double raio = teclado.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.println("Área total: "+ area);

        teclado.close();
    }
}
