package poo.u7.estrutural.proxy;

public class PagamentoEmDinheiro implements Pagamento {

	private float valor;
	
	@Override
	public void pagar(float valor) {
		System.out.println("Pagando em dinheiro: " + valor);
	}

	@Override
	public String toString() {
		return "PagamentoEmDinheiro [valor=" + valor + "]";
	}
}
