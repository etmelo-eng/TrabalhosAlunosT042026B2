package Calculadora;

import java.util.Scanner;

public class AtividadeCalculadora {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o primeiro numero");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double num2 = sc.nextDouble();


		System.out.println("Escolha a operação desejada (+, -, *, /):");
		char operação = sc.next().charAt(0);
		

		double resultado;
		
	
		switch (operação){
			case '+':
				resultado = somar(num1, num2);
				System.out.println("Ressultado: " + resultado);
			break;


			case '-':
				resultado = subtracao(num1, num2);
				System.out.println("Ressultado: " + resultado);
			break;


			case '*':
				resultado = mutiplicacao(num1, num2);
				System.out.println("Ressultado: " + resultado);
			break;


			case '/':
				if (num2 != 0) {
					resultado = divisao(num1, num2);
					System.out.println("Ressultado: " + resultado);
				} else {
					System.out.println("Erro de Divisão por zero!");
				}
			break;


			default:
				System.out.println("Operação inválida! ");
			


		}
		
		
		sc.close();			
		
	}
	
	public static double somar(double num1, double num2){
		return  num1 + num2;
		
	}

	public static double subtracao(double num1, double num2){
		return num1 - num2;
	}
	
	public static double mutiplicacao(double num1, double num2){
		return num1 * num2;
		
	}
	
	public static double divisao(double num1, double num2){
		return num1 / num2;
		
	}
}
