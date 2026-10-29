package CRUDCOMJAVAEPOO;

import CRUDCOMJAVAEPOO.objeto.Livro;
import java.util.Scanner;
import java.util.ArrayList;

public class CRUDCOMJAVAEPOO {
	
	 static ArrayList<Livro> livros = new ArrayList<>();
	 static Scanner sc = new Scanner(System.in);
	 static int proximoId = 1;

	public static void main(String[] args) {
		

		int x;
		
		do{
			Livro.exibirMenu();
			System.out.println("Escolha uma das opções");
			x = sc.nextInt();
			sc.nextLine();
		
			switch(x) {
				case 1:{
					Livro novoLivro = Livro.cadastrar(sc, proximoId);
					if (novoLivro != null) {
                        livros.add(novoLivro);
                        proximoId++;
                        System.out.println("Livro cadastrado com sucesso!");
                    }
				break;
				}
				
				case 2:{
					Livro.Listar(livros);
				break;
				}
				case 3:{
					Livro.BuscarPorID(livros, sc);
				break;
				}
				case 4:{
					Livro.Atualizar(livros, sc);
				break;
				}
				case 5:{
					Livro.excluir(livros, sc);
				break;
				}
				case 0:{
					System.out.println("Saindo do sistema...");
				break;
				}
		
			}
		}while(x != 0);
		
	}
	

}
