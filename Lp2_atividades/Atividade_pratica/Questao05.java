import java.util.Scanner;

public static int MaiorNum(int a, int b){
    if (a>b){
        return a;
    }else{
        return b;
    }
}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int num1 = teclado.nextInt();

    System.out.println("Digite o segundo valor: ");
    int num2 = teclado.nextInt();

    int maior = MaiorNum(num1, num2);

    System.out.println("Maior número digitado foi: " + maior);

    teclado.close();
}
