package poo.u7.estrutural.flyweight.depois;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeArvores {

	private List<TipoArvore> tiposDeArvores = new ArrayList<TipoArvore>();
	
	public TipoArvore getTipoArvore(String nome, String cor, String textura) {
		for (var tipo: tiposDeArvores) {
			// se o tipo já existir
			if (tipo.getCor().equals(cor) && 
					tipo.getNome().equals(nome) && 
					tipo.getTextura().equals(textura)) {
				System.out.println("Tipo encontrado: " + tipo);
				
				// retorna o objeto existente (reaproveitando)
				return tipo;
			}
		}
		
		
		// caso contrário, cria um novo tipo de árvore
		var novoTipo = new TipoArvore(nome, cor, textura);
		System.out.println("Novo tipo criado e armazenado: " + novoTipo);
		
		// armazeno na lista de tipos para reaproveitamento posterior
		this.tiposDeArvores.add(novoTipo);
		
		// retornar o tipo para criar a arvore
		return novoTipo;
	}
}
