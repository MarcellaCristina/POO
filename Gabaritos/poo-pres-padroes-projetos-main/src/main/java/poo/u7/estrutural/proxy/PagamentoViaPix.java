package poo.u7.estrutural.proxy;

public class PagamentoViaPix implements Pagamento {

	private String codPix;
	
	private PagamentoEmDinheiro pagamentoEmDinheiro;
	
	public PagamentoViaPix(String codPix) {
		this.codPix = codPix;
	}
	
	@Override
	public void pagar(float valor) {
		// validação que pode não chamar o objeto principal
		if (valor < 0) {
			System.out.println("ERRO: pagamento inválido.");
			
			return;
		}

		// validacao do codigo pix
		
		
		// delegação: o objeto principal é chamado 
		
		System.out.println("Pagando " + valor + " via cartão de crédito na data de vencimento\n\n");
		
		// inicialização tardia
		this.pagamentoEmDinheiro = new PagamentoEmDinheiro();
		pagamentoEmDinheiro.pagar(valor);
	}

}
