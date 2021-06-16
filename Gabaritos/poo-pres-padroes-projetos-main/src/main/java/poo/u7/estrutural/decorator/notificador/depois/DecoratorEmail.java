package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorEmail;

public class DecoratorEmail extends DecoradorBase {

	private Notificador notificadorEmail;
	
	public DecoratorEmail(Notificador notificador) {
		super(notificador);
		this.notificadorEmail = new NotificadorEmail();
	}
	
	@Override
	public void enviarMensagem(String msg) {
		super.enviarMensagem(msg);
		this.notificadorEmail.enviarMensagem(msg);
	}

}
