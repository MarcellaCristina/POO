package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;

public abstract class DecoradorBase extends Notificador{

	private Notificador notificador;
	
	public DecoradorBase(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void enviarMensagem(String msg) {
		this.notificador.enviarMensagem(msg);
	}
}
