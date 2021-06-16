package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorFacebook extends Notificador{

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Facebook: enviando mensagem " + msg);		
	}

}
