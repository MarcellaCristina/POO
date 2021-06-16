package poo.u7.estrutural.bridge.remote.abstracao;

import poo.u7.estrutural.bridge.remote.implementacao.Dispositivo;

public class ControleRemoto {

	private Dispositivo dispositivo;
	
	public void ligar() {
		System.out.println("Ligando dispositivo pelo controle . . .\n");
		this.dispositivo.ligar();
	}
	
	public void desligar() {
		System.out.println("Desligando dispositivo pelo controle . . .\n");
		this.dispositivo.desligar();
	}
	
	public Dispositivo getDispositivo() {
		return dispositivo;
	}
	
	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
}
