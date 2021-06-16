package poo.u7.estrutural.flyweight.depois;

/**
 * Classe/objeto flyweight
 * @author wrpires
 *
 */
public class TipoArvore {

	private static long quantidade = 0;
	
	private String nome;
	private String cor;
	private String textura;
	
	public TipoArvore(String nome, String cor, String textura) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.textura = textura;
		
		quantidade++;
	}
	
	public void desenhar(int x, int y) {
		System.out.println("Desenhando: " + this.toString() + " em (" + x + "," + y + ") - " + ObjectUtils.getObjectMemoryId(this));
	}

	@Override
	public String toString() {
		return "TipoArvore [nome=" + nome + ", cor=" + cor + ", textura=" + textura + "]";
	}
	
	public String getTextura() {
		return textura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public static long getQuantidade() {
		return quantidade;
	}
}
