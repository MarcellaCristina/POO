package poo.u7.estrutural.facade;

public class LeitorDeTaxaDeBits {

	public String ler(ArquivoDeVideo arquivo, CodecDeCompressao codec) {
		System.out.println("Lendo o arquivo " + arquivo + " utilizando o codec " + codec + "\n\n");
		
		return "123456";
	}

	public String converter(String dados, CodecDeCompressao codec) {
		System.out.println("Escrevendo o buffer de dados " + dados + " utilizando o codec " + codec + "\n\n");
		
		return "123456";
	}
}
