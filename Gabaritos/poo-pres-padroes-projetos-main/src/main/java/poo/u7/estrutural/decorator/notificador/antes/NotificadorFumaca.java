package poo.u7.estrutural.decorator.notificador.antes;

public class NotificadorFumaca extends Notificador { 
	
	@Override
	public void enviarMensagem(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Fumaça: enviando mensagem . . .");
	}

}
