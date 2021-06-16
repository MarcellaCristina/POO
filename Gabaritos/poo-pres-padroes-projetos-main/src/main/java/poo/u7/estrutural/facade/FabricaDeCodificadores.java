package poo.u7.estrutural.facade;

public class FabricaDeCodificadores {

	public CodecDeCompressao extrair(ArquivoDeVideo arquivo) {
		if (arquivo.getNomeArquivo().endsWith(".mp4") ) {
			return new CodificadorDeCompressaoMpeg4();
		} else if (arquivo.getNomeArquivo().endsWith(".ogg") ) {
			return new CodificadorDeCompressaoOgg();
		}
		
		return null;
	}
}
