package poo.u6.criacional.prototype;

public class Retangulo extends Figura {

    private int comprimento;
    private int altura;

    public Retangulo(int x, int y, String cor, int comprimento, int altura) {
        super(x, y, cor);
        this.comprimento = comprimento;
        this.altura = altura;
    }

    // (2) criar um construtor que aceita um obj da mesma classe
    public Retangulo(Retangulo source) {
        super(source);
        this.comprimento = source.comprimento;
        this.altura = source.altura;
    }

    // (3) adicionar o metodo de clonagem
    @Override
    public Prototype clonar() {
        return new Retangulo(this);
    }

    @Override
    public String toString() {
        return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + ", figura=" + super.toString() + "]";
    }

}
