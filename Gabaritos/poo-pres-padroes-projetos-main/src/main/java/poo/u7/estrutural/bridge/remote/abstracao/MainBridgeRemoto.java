package poo.u7.estrutural.bridge.remote.abstracao;

import poo.u7.estrutural.bridge.remote.implementacao.Alexa;
import poo.u7.estrutural.bridge.remote.implementacao.SmartTv;

public class MainBridgeRemoto {

	public static void main(String[] args) {
		var controle = new ControleRemoto();
		
		var smartTv = new SmartTv();
		
		controle.setDispositivo(smartTv);
		
		controle.ligar();
		controle.desligar();
		
		// alexa
		
		controle.setDispositivo(new Alexa());
		controle.ligar();
		controle.desligar();
		
		
	}
}
