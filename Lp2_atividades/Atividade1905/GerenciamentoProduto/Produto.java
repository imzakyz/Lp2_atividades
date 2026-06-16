package Atividade1905.GerenciamentoProduto;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private static int contador = 0;

    // Método construtor
    // O método construtor só é utilizado uma vez, através do comando 'new', para criar um novo objeto da classe Produto. Ele é responsável por inicializar os atributos do objeto com os valores fornecidos como parâmetros.
    public Produto(String nome, double preco, int estoque){
        // Validação dos dados
        
        // Utilizando o this para referenciar os atributos da classe
        this.nome = nome;

        // Chamando os métodos setters para validar e atribuir os valores de preço e estoque
        this.setPreco(preco);
        this.setEstoque(estoque);

        // Incrementando o contador de produtos criados
        contador++;
    }

    // Getters e Setters
    
    // Método getter para o nome do produto
    // O método getter é utilizado para acessar o valor do atributo privado 'nome' de fora da classe
    public String getNome() {
        // O return é utilizado para retornar o valor do nome do produto quando o método é chamado
        return this.nome;
    }

    // Método setter para o nome do produto
    // O método setter é utilizado para definir o valor do atributo privado 'nome' de fora da classe
    public void setNome(String nome) {
        // Na linha abaixo, atribuimos o novo valor do nome ao atributo 'nome' da classe utilizando o this para referenciar o atributo da classe
        this.nome = nome;
    }

    // Método getter para o preço do produto
    // O método getter é utilizado para acessar o valor do atributo privado 'preco' de fora da classe
    public double getPreco(){
        return this.preco;
    }

    // Método setter para o preço do produto
    // O método setter para o preço do produto é utilizado para definir o valor do atributo privado 'preco' de fora da classe
    // Para otimizar o código, apliquei o 'if' dentro do método setter.
    public void setPreco(double preco){
        if (preco < 0){
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0){
            this.estoque = 0;
        } else {
            this.estoque = estoque;
        }
}

    // Método para calcular o valor total do estoque:
    public double valorTotal(){
        return this.preco * this.estoque;
    }

    // Método total de produtos criados:
    public static int getContador() {
        return contador;    
    }

    

}
