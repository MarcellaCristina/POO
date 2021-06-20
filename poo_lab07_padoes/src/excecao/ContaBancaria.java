package excecao;

public class ContaBancaria {

	private float saldo;
	private int numOperacoes = 0;
	private int estado; // 0: em-criacao, 1: disponivel; 2: bloqueada; 3: cancelada
	
	public ContaBancaria(float valor) {
		this.saldo = valor;
	}
	
	public void efetuarSaque(float valor) throws ValorSaqueInvalidoException{
		// verificar valor a ser sacado > 0
		if (valor <= 0) {
			// lançando uma excecao para ser tratada por um tratador especifico
			throw new ValorSaqueInvalidoException(valor);
		}
		// verificar saldo disponivel
		
		// verificar o estado da conta bancaria (somente estado disponivel é permitido)
		
		
		// caso de sucesso.
		this.saldo = this.saldo - valor;
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void efetuarDeposito(float valor) {
		
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void incrementarContadorOperacoes() {
		this.numOperacoes++;
		
		System.out.println("Operacoes: "+ numOperacoes);
	}
}
