package poo.u7.estrutural.flyweight.depois;

public class Arvore {
	
	private static long quantidade = 0;
	
	// nao é compartilhavel
	private int x;
	private int y;
	
	// é compartilhavel
	//private String nome;
	//private String cor;
	//private String textura;
	
	// extração do estado intrinsico em uma classe separada
	private TipoArvore tipo;
	
	public Arvore(int x, int y, TipoArvore tipo) {
		super();
		this.x = x;
		this.y = y;
		this.tipo = tipo;
		
		quantidade++;
	}

	public void desenhar() {
		System.out.println("Desenhando a árvore " + this.toString());
		tipo.desenhar(x, y);
	}

	@Override
	public String toString() {
		return "Arvore [x=" + x + ", y=" + y + ", tipo=" + tipo + "]";
	}
	
	public static long getQuantidade() {
		return quantidade;
	}
}
