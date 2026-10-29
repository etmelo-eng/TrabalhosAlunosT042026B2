package projeto;

import java.util.Scanner;

public class Produto {
	String nome;
	double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
    	this.nome = nome;
    	this.preco = preco;
    	this.quantidade = quantidade;
    }
    
    public double calcularTotal() {
    	return this.preco * this.quantidade;
    }
    
		public static void main(String[] args) {
			try (Scanner leitor = new Scanner(System.in)) {
				System.out.print("Informe o nome do produto: ");
				String nome = leitor.nextLine();

				System.out.print("Informe o preço: ");
				double preco = leitor.nextDouble();

				System.out.print("Informe a quantidade: ");
				int quantidade = leitor.nextInt();
				
				System.out.print("\n");
				
				Produto p = new Produto(nome, preco, quantidade);
				System.out.println("Produto: " + p.nome);
				System.out.printf("Valor total da compra: R$%.2f\n", p.calcularTotal());
			}

	}

}
