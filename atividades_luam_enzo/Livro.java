package projeto;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }

    public void emprestar() {
        if (this.emprestado) {
            System.out.println("O livro" + this.titulo + "já está emprestado");
        } else {
            this.emprestado = true;
            System.out.println("O livro" + this.titulo + "foi emprestado com sucesso");
        }
    }

    public void devolver() {
        if (!this.emprestado) {
            System.out.println("O livro" + this.titulo + "não está emprestado para ser devolvido");
        } else {
            this.emprestado = false;
            System.out.println("O livro" + this.titulo + "foi devolvido com sucesso");
        }
    }

    public void exibirInformacoes() {
        String status = this.emprestado ? "Emprestado" : "Disponível";
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.numeroPaginas);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        livro1.exibirInformacoes();
        
        System.out.println("\n Testando Empréstimos");
        livro1.emprestar();
        livro1.emprestar();
        
        System.out.println("\n Testando Devoluções");
        livro1.devolver();
        livro1.devolver();
    }
}