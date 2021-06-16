package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorSlack extends Notificador {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Slack: enviando mensagem " + msg);		
	}

}
