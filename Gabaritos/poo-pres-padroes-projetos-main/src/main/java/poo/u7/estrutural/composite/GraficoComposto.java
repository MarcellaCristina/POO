package poo.u7.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraficoComposto implements Grafico{

	// (4) vetor que armazena os elementos simples e complexos
	private List<Grafico> filhos = new ArrayList<Grafico>();

	// adicionar elemento ou composto
	public void adicionarFilho(Grafico g) {
		this.filhos.add(g);
	}
	
	// remover elemento ou composto
	public void removerFilho(Grafico g) {
		this.filhos.remove(g);
	}
	
	@Override
	public void mover(int x, int y) {
		// pegando cada filho dentro do grafico composto
		for (var filho: filhos) {
			// mover cada filho
			filho.mover(x, y);			
		}
	}

	@Override
	public String toString() {
		return "GraficoComposto [filhos=" + filhos + "]";
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando: " + this.toString());
		
		for (var filho: filhos) {
			filho.desenhar();
		}
	}

}
