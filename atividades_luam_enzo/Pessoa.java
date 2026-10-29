package projeto;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("meu nome é " + this.nome);
        System.out.println("e tenho " + this.idade + "anos");
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 20);
        p1.apresentar();
    }
}