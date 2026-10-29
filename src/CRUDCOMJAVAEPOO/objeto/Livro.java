package CRUDCOMJAVAEPOO.objeto;

import java.util.Scanner;
import java.util.ArrayList;

public class Livro {
	private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(int id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + titulo + " | Autor: " + autor + " | Ano: " + anoPublicacao;
    }
    
    public static void exibirMenu() {
        System.out.println("\n========== SISTEMA DE GERENCIAMENTO ==========\n");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair\n");
    }
    
    public static Livro cadastrar(Scanner sc, int id) {
        System.out.println("\n========== Cadastrar Livro ==========\n");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Ano de publicação: ");
        int ano = sc.nextInt();
        sc.nextLine();
        
        if (ano < 0) {
            System.out.println("Ano inválido! Cadastro cancelado.");
            return null;
        }

        return new Livro(id, titulo, autor, ano);
    }
    
    public static void Listar(ArrayList<Livro> livros) {
		System.out.println("\n========== Lista de Livros ==========\n");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro l : livros) {
            System.out.println(l);
        }	
    }
    
    public static void BuscarPorID(ArrayList<Livro> livros, Scanner sc) {
    	if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
    	
    	System.out.println("Digite o ID do livro:");
    	int buscar;
    	
    	try {
    	    buscar = Integer.parseInt(sc.nextLine().trim());
    	} catch (NumberFormatException e) {
    	    System.out.println("ID inválido! Digite apenas números.");
    	    return;
    	}
    	for (Livro l : livros) {
    	    if (l.id == buscar) {
    	        System.out.println(l);
    	        return;
    	    }
    	}
    	System.out.println("ID não encontrado.");
   
    }
    
    public static void Atualizar(ArrayList<Livro> livros, Scanner sc) {
    	System.out.println("\n========== Atualizar Livros ==========\n");
    	
    	if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        System.out.print("Digite o ID do livro: ");
        int buscar;
        try {
            buscar = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido! Digite apenas números.");
            return;
        }
        
        for (Livro l : livros) {
            if (l.id == buscar) {
                System.out.println("Dados atuais: " + l);

                System.out.print("Novo título: ");
                l.titulo = sc.nextLine();

                System.out.print("Novo autor: ");
                l.autor = sc.nextLine();

                System.out.print("Novo ano de publicação: ");
                try {
                    int novoAno = Integer.parseInt(sc.nextLine().trim());
                    if (novoAno < 0) {
                        System.out.println("Ano inválido! O ano não foi alterado.");
                    } else {
                        l.anoPublicacao = novoAno;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ano inválido! O ano não foi alterado.");
                }

                System.out.println("Livro atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ID não encontrado.");

    }
    
    public static void excluir(ArrayList<Livro> livros, Scanner sc) {
        System.out.println("\n========== Excluir Livro ==========\n");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.print("Digite o ID do livro: ");
        int buscar;
        try {
            buscar = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido! Digite apenas números.");
            return;
        }

        for (Livro l : livros) {
            if (l.id == buscar) {
                livros.remove(l);
                System.out.println("Livro excluído com sucesso!");
                return;
            }
        }

        System.out.println("ID não encontrado.");
    }

}
