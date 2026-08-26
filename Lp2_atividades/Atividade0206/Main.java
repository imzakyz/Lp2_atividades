package Atividade0206;

public class Main {

    public static void main(String[] args) {
        // Instanciação do primeiro funcionário (Matrícula será 1)
        Funcionario f1 = new Funcionario("Zé", 25.0, 44.0);
        f1.numRG = "12345678";
        f1.cpf = "123456789101";
        f1.calculaSalario();
        f1.imprimeDados();

        // Instanciação do segundo funcionário (Matrícula será 2)
        Funcionario f2 = new Funcionario("Maria", 25.0, 40.0);
        f2.numRG = "98765432";
        f2.cpf = "109876543210";
        f2.calculaSalario();
        f2.imprimeDados();
    }
}