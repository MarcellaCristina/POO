package poo.u7.estrutural.facade;

import java.io.File;

public class ConversorDeVideo implements Conversor{

	// (1) identificar a possibilidade de criação de uma interface simples
	// (2) criar uma abstração (método simples) para encapsular a complexidade
	public File converter(String nomeArquivo, String formato) {
		System.out.println("Convertendo o arquivo " + nomeArquivo + " para o formato " + formato + "\n\n");
		
		// abrindo arquivo de entrada
		var arquivo = new ArquivoDeVideo(nomeArquivo);
		
		// obtendo o codec de entrada
		var codec = new FabricaDeCodificadores().extrair(arquivo);
		
		// obtendo o codec de destino
		CodecDeCompressao codecDestino = null;
		if (formato.equals("mp4")) {
			codecDestino = new CodificadorDeCompressaoMpeg4();
		} else {
			codecDestino = new CodificadorDeCompressaoOgg();
		}
		
		// lendo os dados usando codec de origem
		var buffer = new LeitorDeTaxaDeBits().ler(arquivo, codec);
		
		// escrevendo os dados uasndo codec de destino
		var resultado = new LeitorDeTaxaDeBits().converter(buffer, codecDestino);
		
		// codificando o audio a partir do resultado
		resultado = new MixadorDeAudio().codificarAudio(resultado);
		
		// retornando o resultado finalizado
		return new File(resultado);
	}
}
