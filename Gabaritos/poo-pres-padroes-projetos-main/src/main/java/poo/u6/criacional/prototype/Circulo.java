package poo.u6.criacional.prototype;

public class Circulo extends Figura {

    int raio;

    public Circulo(int x, int y, String cor, int raio) {
        super(x, y, cor);
        this.raio = raio;
    }

    // (2) criar um construtor que aceita um obj da mesma classe
    public Circulo(Circulo source) {
        super(source);
        this.raio = source.raio;
    }

    // (3) adicionar o metodo de clonagem
    @Override
    public Prototype clonar() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", figura=" + super.toString() + "]";
    }

}
