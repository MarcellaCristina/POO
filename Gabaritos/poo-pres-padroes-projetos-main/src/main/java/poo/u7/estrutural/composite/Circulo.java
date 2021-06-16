package poo.u7.estrutural.composite;

public class Circulo extends Ponto{

	public int raio;
	
	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void desenhar() {
		super.desenhar();
		System.out.println("Desenhando: " + this.toString());
	}

}
