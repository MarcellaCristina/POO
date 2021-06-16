package poo.u7.estrutural.composite;

// folha (leaf)
public class Ponto implements Grafico{

	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void mover(int x, int y) {
		this.x += x;
		this.y += y;		
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando: " + this.toString());		
	}	
}