package poo.u7.estrutural.flyweight.antes;

import poo.u7.estrutural.flyweight.depois.Arvore;
import poo.u7.estrutural.flyweight.depois.Floresta;
import poo.u7.estrutural.flyweight.depois.TipoArvore;

public class MainFloresta {

	public static void main(String[] args) {
		var floresta = new Floresta("antes");
		floresta.plantar(1, 1, "Ipê", "rosa", "liso");
		floresta.desenhar();
		
		floresta.plantar(1, 2, "Ipê", "amarelo", "liso");
		floresta.plantar(2, 1, "Ipê", "branco", "liso");
		floresta.plantar(2, 2, "Ipê", "branco", "liso");
		floresta.plantar(2, 3, "Ipê", "branco", "liso");
		
		for (int i = 5; i < 100; i = i + 2) {
			floresta.plantar(i, 2, "Ipê", "branco", "liso");			
		}
		floresta.desenhar();
		System.out.println("Quantidade - árvores: " + Arvore.getQuantidade());
		System.out.println("Quantidade - tipo de árvore: " + TipoArvore.getQuantidade());		
		
		System.out.println("\n\n===\n\n");		
	}
}
