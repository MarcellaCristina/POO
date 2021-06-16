package poo.u7.estrutural.facade;

public class Aplicacao {

	public static void main(String[] args) {
		Conversor conversor = new ConversorDeVideo();

		// (3) fachada simplificada
		var ogg = conversor.converter("teste.mp4", "ogg");

		System.out.println(ogg);
	}
}
