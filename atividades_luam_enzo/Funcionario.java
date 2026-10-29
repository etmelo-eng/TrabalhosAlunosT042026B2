package projeto;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario("Fernanda", "Desenvolvedora", 2000.00);
        
        System.out.printf("Funcionário: %s,  Cargo: %s,  Salário inicial: R$ %.2f%n", func.nome, func.cargo, func.salario);
        
        func.aumentarSalario(10);
        
        System.out.printf("Novo salário após 10%% de aumento: R$ %.2f%n", func.salario);
    }
}