package projeto;

public class PessoaCadastro {
    String nome;
    int idade;
    String cidade;

    public PessoaCadastro(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void apresentar() {
        System.out.println("meu nome é " + this.nome + " e moro em " + this.cidade);
    }

    public void fazerAniversario() {
        this.idade += 1;
        System.out.println(this.nome + " fez aniversário agora tem " + this.idade + " anos");
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "Idade: " + this.idade + " anos e moro na Cidade: " + this.cidade);
    }

    public static void main(String[] args) {
        PessoaCadastro p1 = new PessoaCadastro("Lucas", 25, "São Paulo");
        PessoaCadastro p2 = new PessoaCadastro("Beatriz", 30, "Rio de Janeiro");
        PessoaCadastro p3 = new PessoaCadastro("Gabriel", 19, "Curitiba");

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        p1.apresentar();


        p1.fazerAniversario();


        p1.exibirDados();
    }
}