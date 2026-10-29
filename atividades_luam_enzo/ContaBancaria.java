package projeto;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso %n", valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso %n", valor);
        } else {
            System.out.println("O saque não pode ser realizado: Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s  Saldo final: R$ %.2f%n", this.titular, this.saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 500.00);

        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.sacar(1000.00);
        conta.exibirSaldo();
    }
}