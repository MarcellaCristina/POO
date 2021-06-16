package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorSms;

public class DecoradorSms extends DecoradorBase {

	private Notificador notificadorSms;
	
	public DecoradorSms(Notificador notificador) {
		super(notificador);
		this.notificadorSms = new NotificadorSms();
	}

	public void enviarMensagem(String msg) {
		// chama o método da superclasse
		super.enviarMensagem(msg);
		// chama o metodo do decorador
		notificadorSms.enviarMensagem(msg);
	}
}
