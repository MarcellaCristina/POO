package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorSms extends Notificador {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("SMS: enviando mensagem.");
	}

}
