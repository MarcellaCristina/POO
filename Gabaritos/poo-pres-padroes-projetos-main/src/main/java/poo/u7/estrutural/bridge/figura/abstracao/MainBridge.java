package poo.u7.estrutural.bridge.figura.abstracao;

import poo.u7.estrutural.bridge.figura.implementação.Amarelo;
import poo.u7.estrutural.bridge.figura.implementação.Branco;
import poo.u7.estrutural.bridge.figura.implementação.Vermelho;

public class MainBridge {

    public static void main(String[] args) {
        Figura c = new Circulo();
        c.setCor(new Vermelho());
        
        Figura t = new Triangulo();
        t.setCor(new Amarelo());
        
        Figura r = new Retangulo();
        
        c.setCor(new Branco());
    }
}
