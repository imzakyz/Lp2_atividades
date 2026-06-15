import java.util.Scanner;

public class Questao02 {

    public static float calcularCusto(float distancia, float preco){
        return (distancia / 12) * preco;
    }


    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        float dist, gasolina;

        //entrada de dados
        System.out.println("---USE VÍRGULAS---");
        System.out.println("Digite a distância: ");
        dist = teclado.nextFloat();

        System.out.println("Digite o valor da gasolina: ");
        gasolina = teclado.nextFloat();

        //processamento
        float total_valor, total_dist;

        total_valor = calcularCusto(dist, gasolina);
        total_dist  = dist/12;

        //saída

        System.out.println("Valor gasto em gasolina: " + total_valor);
        System.out.println("Quantidade de Litros de gasolina: " + total_dist);

        teclado.close();
    }
}
