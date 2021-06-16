package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorWhatsApp extends Notificador {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("WhatsApp: enviando mensagem " + msg);
	}

}
