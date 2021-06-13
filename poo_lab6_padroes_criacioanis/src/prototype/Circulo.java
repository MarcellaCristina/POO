package prototype;

public class Circulo implements Prototype {
	
	private int x; // comprimento
	private int y; // diâmetro
	private int raio;
	
	public Circulo(int x, int y, int raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	// 2- Criar um construtor que aceita um obj do mesmo
	public Circulo(Circulo c) {
		super();
		this.x = c.x;
		this.y = c.y;
		this.raio = c.raio;
	}

	@Override
	public Prototype clonar() {
		return new Circulo(this);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", raio=" + raio + "]";
	}	
}
