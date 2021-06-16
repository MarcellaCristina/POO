package poo.u7.estrutural.proxy;

public class MainPagamento {

	public static void main(String[] args) {
		var banco = new Banco();

		var credito = new CartaoDeCredito();
		
		credito.pagar(100.0f);
		
		banco.receberPagamento(credito);
		
		
		var pix = new PagamentoViaPix("31-91234567");
		
		pix.pagar(200.0f);
	}
}
