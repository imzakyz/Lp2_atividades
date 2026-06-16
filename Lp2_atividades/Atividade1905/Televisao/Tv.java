package Atividade1905.Televisao;

public class Tv {

    // Atributos da TV
    private int polegadas;
    private int volume;
    private int canal;
    private int voltage;
    private String marca;
    private boolean ligada;

    // Construtor da TV, onde é possível definir as polegadas, o voltage e a marca da TV. O volume inicia em 5, o canal inicia em 1 e a TV inicia desligada.
    public Tv(int polegadas, int voltage, String marca){
        this.polegadas = polegadas;
        this.voltage = voltage;
        this.marca = marca;
        this.volume = 5;
        this.canal = 1;
        this.ligada = false;
    }

    // Métodos da TV


    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver desligada, ela é ligada e o consumo é calculado multiplicando o voltage pelo número de polegadas.
    public void ligarTv(){
        this.ligada = true;
        System.out.println("A TV " + this.marca + " está ligada.");
        System.out.println("O consumo da TV" + this.marca + " é de " + (this.voltage * this.polegadas) + " watts.");
    }

    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver ligada, ela é desligada.
    public void desligarTv(){
        this.ligada = false;
        System.out.println("A TV " + this.marca + " está desligada.");
    }

    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver ligada, o volume é aumentado em 1. O volume máximo é 10.
    public void aumentarVolume(){
        if (this.ligada == true){
            this.volume++;
            if (this.volume > 10){
                this.volume = 10;
            }
            System.out.println("O volume da TV " + this.marca + " aumentou. Volume atual: " + this.volume);
        }else{
            System.out.println("A TV " + this.marca + " está desligada. Ligue a TV para aumentar o volume.");
        }
    }

    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver ligada, o volume é diminuído em 1. O volume mínimo é 1.
    public void diminuirVolume(){
        if (this.ligada == true){
            this.volume--;
            if (this.volume <1){
                this.volume = 1;
            }
            System.out.println("O volume da TV " + this.marca + " diminuiu. Volume atual: " + this.volume);
        }else{
            System.out.println("A TV " + this.marca + " está desligada. Ligue a TV para diminuir o volume.");
        }
    }

    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver ligada, o canal é aumentado em 1. O canal mínimo é 1.
    public void subirCanal(){
        if (this.ligada == true){
            this.canal++;
            System.out.println("O canal da TV " + this.marca + " subiu. Canal atual: " + this.canal);
        }else{
            System.out.println("A TV " + this.marca + " está desligada. Ligue a TV para subir o canal.");
        }
    }

    // Quando ativado, o método verifica se a Tv está ligada.
    // Se a TV estiver ligada, o canal é diminuído em 1. O canal mínimo é 1.
    public void descerCanal(){
        if (this.ligada == true){
            this.canal--;
            if (this.canal < 1){
                this.canal = 1;
            }
            System.out.println("O canal da TV " + this.marca + " desceu. Canal atual: " + this.canal);
        }else{
            System.out.println("A TV " + this.marca + " está desligada. Ligue a TV para descer o canal.");
        }
    }
}
