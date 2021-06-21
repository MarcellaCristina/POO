package excecao;

public class ValorSaldoInsuficienteException extends Exception {

	public ValorSaldoInsuficienteException(float valor) {
		super("Saldo insufiente!");
	}
}
