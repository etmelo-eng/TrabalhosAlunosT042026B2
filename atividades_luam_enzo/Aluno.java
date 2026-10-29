package projeto;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String verificarSituacao() {
        if (this.nota >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 17, 7.5);
        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Nota: " + aluno1.nota);
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }
}