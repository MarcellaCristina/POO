package poo.u7.estrutural.decorator.notificador.antes;

public class MainNotificador {

	public static void main(String[] args) {
		var email = new NotificadorEmail();
		var sms = new NotificadorSms();
		var slack = new NotificadorSlack();
		var fb = new NotificadorFacebook();
		var zap = new NotificadorWhatsApp();
		
		// enviando notificação por um único canal
		sms.enviarMensagem("Olá mundo!");
		
		// enviando notificação por todos os canais, necessário instanciar todas as classes
		sms.enviarMensagem("Casa pegando fogo!");
		email.enviarMensagem("Casa pegando fogo!");
		slack.enviarMensagem("Casa pegando fogo!");
		fb.enviarMensagem("Casa pegando fogo!");
		zap.enviarMensagem("Casa pegando fogo!");
	}

}
