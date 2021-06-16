package poo.u7.estrutural.flyweight.depois;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

	private String nome;
	
	private List<Arvore> arvores = new ArrayList<Arvore>();
	
	// fabrica de tipos de arvore
	private FabricaDeArvores fabrica = new FabricaDeArvores();
	
	public Floresta(String nome) {
		super();
		this.nome = nome;
	}

	// sem o padrão flyweight
	public Arvore plantar(int x, int y, String nome, String cor, String textura) {
		var tipo = new TipoArvore(nome, cor, textura);
		
		var arvore = new Arvore(x, y, tipo);
		this.arvores.add(arvore);
		
		return arvore;
	}

	// com o flyweight
	public Arvore plantar2(int x, int y, String nome, String cor, String textura) {
		var tipo = fabrica.getTipoArvore(nome, cor, textura);
		
		// criando a arvore
		var arvore = new Arvore(x, y, tipo);
		this.arvores.add(arvore);
		
		return arvore;
	}
	
	public void desenhar() {
		System.out.println("Desenhando a floresta " + nome);
		for (var a: arvores) {
			a.desenhar();
		}
	}
}
