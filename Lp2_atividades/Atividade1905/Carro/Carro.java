package Atividade1905.Carro;

public class Carro {
    
    // Atributos
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;
    private boolean ligado;
    
    // Construtor
    // O metodo construtor é um método especial que é chamado quando um objeto é criado, 
    // O metodo construtor é utilizado para inicializar os atributos do objeto. 
    // O nome do construtor deve ser o mesmo da classe e ele não tem um tipo de retorno, nem mesmo void.
    public Carro(String modelo, double aceleracao) {
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        this.velocidade = 0.0;
        this.marcha = 0;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro " + this.modelo + " está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O carro " + this.modelo + " está desligado.");
    }

    public void acelerar(){
        if (this.ligado==true){
            this.velocidade += this.aceleracao;
            System.out.println("O carro " + this.modelo + " acelerou. Velocidade atual: " + this.velocidade + " km/h.");
        }else{
            System.out.println("O carro " + this.modelo + " está desligado. Ligue o carro para acelerar.");
        }
    }

    public void desacelerar(){
        if (this.ligado ==true){
            this.velocidade = this.velocidade - this.aceleracao;
            if (this.velocidade < 0){
                this.velocidade = 0;
            }
            System.out.println("O carro " + this.modelo + " desacelerou. Velocidade atual: " + this.velocidade + " km/h.");
        }else{
            System.out.println("O carro " + this.modelo + " está desligado. Ligue o carro para desacelerar.");
        }
    }

    public void direita(){
        if (this.ligado == true){
            System.out.println("O carro " + this.modelo + " virou à direita.");
        }else{
            System.out.println("O carro " + this.modelo + " está desligado. Ligue o carro para virar à direita.");
        }
    }

    public void esquerda(){
        if (this.ligado == true){
            System.out.println("O carro " + this.modelo + " virou à esquerda.");
        }else{
            System.out.println("O carro " + this.modelo + " está desligado. Ligue o carro para virar à esquerda.");
        }
    }

    public void marchaCima(){
        if (this.ligado ==true){
            this.marcha ++;
            System.out.println("O carro " + this.modelo + " subiu de marcha. Marcha atual: " + this.marcha);
        }
    }

    public void marchaBaixo(){
        if (this.ligado ==true){
            this.marcha --;
            System.out.println("O carro " + this.modelo + " desceu de marcha. Marcha atual: " + this.marcha);
        }
    }
}
