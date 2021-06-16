package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorEmail extends Notificador {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Email: enviando mensagem " + msg);
	}

}
