package excecao;

public class ContaBancaria {

	private float saldo;
	private int numOperacoes = 0;
	private int estado; // 0: em-criacao, 1: disponivel; 2: bloqueada; 3: cancelada
	
	public ContaBancaria(float valor, int estado) {
		this.saldo = valor;
		this.estado = estado;
	}
	
	public void efetuarSaque(float valor) throws ValorSaqueInvalidoException, ValorSaldoInsuficienteException, EstadoContaException {
		// verificar o estado da conta bancaria (somente estado disponivel é permitido)
		
		if(estado != 1) {
			throw new EstadoContaException(estado);
			
		}
		// verificar valor a ser sacado > 0
		if (valor <= 0) {
			// lançando uma excecao para ser tratada por um tratador especifico
			throw new ValorSaqueInvalidoException(valor);
		}
		// verificar saldo disponivel
		if(valor > saldo) {
			throw new ValorSaldoInsuficienteException(valor);
		}
		
	
		
		
		
		
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
