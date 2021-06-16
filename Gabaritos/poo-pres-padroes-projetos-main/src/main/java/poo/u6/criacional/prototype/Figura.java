package poo.u6.criacional.prototype;

public abstract class Figura implements Prototype {

    protected int x;
    protected int y;
    protected String cor;

    public Figura(int x, int y, String cor) {
        super();
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public Figura(Figura source) {
        this.x = source.x;
        this.y = source.y;
        this.cor = source.cor;
    }

    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + ", cor=" + cor + "]";
    }

}
