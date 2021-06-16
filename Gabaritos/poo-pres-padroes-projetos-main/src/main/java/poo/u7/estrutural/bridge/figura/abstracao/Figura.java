package poo.u7.estrutural.bridge.figura.abstracao;

import poo.u7.estrutural.bridge.figura.implementação.Cor;

public class Figura {

	// interface - implementação -> expandir o nosso sistema
	// composição: interface Java
    private Cor cor; // expansao

    public Cor getCor() {
        return cor;
    }
    
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void desenhar() {
    	System.out.println("Colorindo a figura com a cor " + cor.getNome());
    }
}


// abstracao: Figura (controle)


// implementacao: Cor (implementação)


// abstracao: front-end: usuário utiliza

// REST/JSON (ponte)

// implementação: back-end: 