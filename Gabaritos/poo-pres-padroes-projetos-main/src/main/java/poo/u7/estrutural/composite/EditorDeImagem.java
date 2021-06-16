package poo.u7.estrutural.composite;

public class EditorDeImagem {

	public static void main(String[] args) {
		var p1 = new Ponto(2, 2);
		p1.mover(1, 1);
		p1.desenhar();
		
		var p2 = new Ponto(4, 4);
		p2.desenhar();
		
		var c1 = new Circulo(2,  2, 4);
		c1.mover(1, 1);
		c1.desenhar();
		
		// compostos
		var composite = new GraficoComposto();
		composite.adicionarFilho(p1);
		composite.adicionarFilho(p2);
		composite.mover(3, 2);
		composite.desenhar();
		
		// duas retas com intersessão
//	https://www.desmos.com/calculator/mhq4hsncnh
		var p3 = new Ponto(6, 6);
		
		var p4 = new Ponto(6, 9);
		
		var p5 = new Ponto(9, 6);
		
		var retas = new GraficoComposto();
		retas.adicionarFilho(p3);
		retas.adicionarFilho(p4);
		retas.adicionarFilho(p5);
		retas.desenhar();
		
		retas.mover(1, 1);
		retas.desenhar();
		
		var composto2 = new GraficoComposto();
		composto2.adicionarFilho(retas);
		composto2.mover(3,  -1);
	}
}
