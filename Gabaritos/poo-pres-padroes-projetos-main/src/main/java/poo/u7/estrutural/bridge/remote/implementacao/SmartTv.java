package poo.u7.estrutural.bridge.remote.implementacao;

public class SmartTv implements Dispositivo{

	@Override
	public void ligar() {
		System.out.println(this.getClass().getSimpleName() + " ligando . . .\n");
	}

	@Override
	public void desligar() {
		System.out.println(this.getClass().getSimpleName() + " desligando . . .\n");
	}

	@Override
	public void aumentarVolume() {
		System.out.println(this.getClass().getSimpleName() + " autmentando volume . . .\n");		
	}

	@Override
	public void diminuirVolume() {
		System.out.println(this.getClass().getSimpleName() + " diminuindo volume . . .\n");
		
	}

	@Override
	public void tocarMidia() {
		System.out.println(this.getClass().getSimpleName() + " tocando midia . . .\n");
		
	}

}
