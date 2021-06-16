package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorEmail;

public class Aplicacao {

	private boolean slackHabilitado;
	
	private boolean fbHabilitado;
	
	private Notificador notificador;
	
	// configurar o notificador em forma de pilha/stack
	public void configurar() {
		Notificador notificador = new NotificadorEmail();
		
		if (slackHabilitado) {
			notificador = new DecoradorSlack(notificador);
		} else if (fbHabilitado) {
			notificador = new DecoradorFacebook(notificador);
		}
		
		this.notificador = notificador;
	}
	
	public void enviarMensagem(String msg) {
		this.notificador.enviarMensagem(msg);
	}
}
