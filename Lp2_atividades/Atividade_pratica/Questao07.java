import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura= teclado.nextDouble();

        double imc = peso/(altura*altura);

        if(imc>=30 && imc<=35){
            System.out.println(nome + ", Você está: Obesidade grau 1");
            System.out.println("Seu IMC equivale à: "+imc);
        }else if(imc>=25 && imc <30){
            System.out.println(nome +", Você está: Acima do Peso");
            System.out.println("Seu IMC equivale à: "+imc);
        }else if(imc<25 && imc>18.5){
            System.out.println(nome +", Você está: Peso Ideal");
            System.out.println("Seu IMC equivale à: "+imc);
        } else if (imc<18.5) {
            System.out.println(nome +", Você está: Abaixo do peso");
            System.out.println("Seu IMC equivale à: "+imc);
        }else if(imc>35 && imc<40){
            System.out.println(nome +", Você está: Obesidade grau 2");
            System.out.println("Seu IMC equivale à: "+imc);
        }else{
            System.out.println(nome + ", Você está: Obesidade Mórbida");
            System.out.println("Seu IMC equivale à: "+imc);
        }

        teclado.close();
    }
}
