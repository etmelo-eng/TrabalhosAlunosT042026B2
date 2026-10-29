package projeto;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5.0, 10.0);
        
        System.out.println("Largura: " + ret.largura + "Altura: " + ret.altura);
        System.out.println("Área do retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro());
    }
}