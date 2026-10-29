package projeto;

public class Celular {
    String marca;
    String modelo;
    int bateria;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
    }

    public void usarCelular() {
        if (this.bateria >= 10) {
            this.bateria -= 10;
        } else {
            this.bateria = 0;
            System.out.println("Celular sem bateria");
        }
    }

    public void carregar() {
        this.bateria = 100;
        System.out.println("Celular totalmente carregado");
    }

    public void exibirBateria() {
        System.out.println("Bateria atual do " + this.marca + " " + this.modelo + ": " + this.bateria + "%");
    }

    public static void main(String[] args) {
        Celular cel = new Celular("Samsung", "Galaxy S23");

        System.out.println("Utilizando o Celular");
        cel.usarCelular();
        cel.usarCelular();
        cel.usarCelular();
        cel.exibirBateria();

        System.out.println("Carregando o Celular");
        cel.carregar();
        cel.exibirBateria();
    }
}