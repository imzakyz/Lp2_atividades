package Atividade1905.Televisao;

public class Tv {

    private int polegadas;
    private int volume;
    private int canal;
    private int voltage;
    private String marca;
    private boolean ligada;

    public Tv(int polegadas, int voltage, String marca){
        this.polegadas = polegadas;
        this.voltage = voltage;
        this.marca = marca;
        this.volume = 5;
        this.canal = 1;
        this.ligada = false;
    }

    public void ligarTv(){
        this.ligada = true;
        System.out.println("A TV " + this.marca + " está ligada.");
        System.out.println("O consumo da TV" + this.marca + " é de " + (this.voltage * this.polegadas) + " watts.");
    }

    public void desligarTv(){
        this.ligada = false;
        System.out.println("A TV " + this.marca + " está desligada.");
    }

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

    public void subirCanal(){
        if (this.ligada == true){
            this.canal++;
            System.out.println("O canal da TV " + this.marca + " subiu. Canal atual: " + this.canal);
        }else{
            System.out.println("A TV " + this.marca + " está desligada. Ligue a TV para subir o canal.");
        }
    }

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
