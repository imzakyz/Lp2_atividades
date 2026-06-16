package Atividade1905.GerenciamentoProduto;

public class Main {
    public static void main(String[] args) {
        
        // Criando objetos da classe Produto utilizando o construtor com o comando 'new'
        Produto produto1 = new Produto("Nintendo Switch", 1799.99, 5);
        Produto produto2 = new Produto("PlayStation 5", 4999.99, 3);
        Produto produto3 = new Produto("Xbox Series X", 4499.99, 4);
        Produto produto4 = new Produto("Nintendo Switch 2", 4699.99, 2);

        // Exibindo as informações dos produtos utilizando os métodos getters
        System.out.println("\nQuantidade de produtos cadastrados: " + Produto.getContador());
        System.out.println("\n-----------------------------");

        // Para cada produto dentro do array de produtos, exibe as informações utilizando os métodos getters
        // O loop for-each é utilizado para iterar sobre cada produto dentro do array de produtos e exibir suas informações utilizando os métodos getters
        for (Produto produto : new Produto[]{produto1, produto2, produto3, produto4}) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque() + " unidades");
            System.out.println("-----------------------------");
        }

    }
}
