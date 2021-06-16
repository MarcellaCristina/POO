package poo.u7.estrutural.proxy;

// objeto proxy
public class CartaoDeCredito implements Pagamento {

	private String numero;
	
	private String validade; // mm/aa
	
	private String cpf;
	
	private String codSeguranca;
	
	// Criar uma classe de proxy, com um atributo referenciando a classe de serviço
	private PagamentoEmDinheiro pagamentoEmDinheiro;
	
	private float valor;
	
	public CartaoDeCredito() {
		this.pagamentoEmDinheiro = new PagamentoEmDinheiro();
	}
	
	// Implementar os métodos da classe proxy, delegando o trabalho para a classe de serviço
	@Override
	public void pagar(float valor) {
		// validação que pode não chamar o objeto principal
		if (valor < 0) {
			System.out.println("ERRO: pagamento inválido.");
			
			return;
		}

		// validacoes a serem feitas antes do pagamento
		// 1. validar se o numero existe
		// 2. verificar se o cartão é valido
		// 3. verificar se o cpf corresponde ao proprietário do cartão
		// 4. verificar se o cod-seguranca corresponde ao codigo do cartão
		// 5. verificar se o cartão tem limite disponivel
		
		if (verificarLimiteDisponivel() == false) {
			System.out.println("INFO: crédito insuficiente para a compra.");
			
			return;
		}
		
		// delegação: o objeto principal é chamado 
		this.valor = valor;
		
		System.out.println("Pagando " + valor + " via cartão de crédito na data de vencimento\n\n");
		
		// chamada para o objeto real - executar o pagamento
		pagamentoEmDinheiro.pagar(valor);
	}

	private boolean verificarLimiteDisponivel() {
		return false;
	}

	@Override
	public String toString() {
		return "CartaoDeCredito [valor=" + valor + "]";
	}	

}
