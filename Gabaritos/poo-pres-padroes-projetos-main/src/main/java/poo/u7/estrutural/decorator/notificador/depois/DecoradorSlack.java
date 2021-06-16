package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorSlack;

public class DecoradorSlack extends DecoradorBase {
	
	private Notificador notificadorSlack;

	public DecoradorSlack(Notificador notificador) {
		super(notificador);
		this.notificadorSlack = new NotificadorSlack();
	}

	public void enviarMensagem(String msg) {
		super.enviarMensagem(msg);
		this.notificadorSlack.enviarMensagem(msg);
	}

}
