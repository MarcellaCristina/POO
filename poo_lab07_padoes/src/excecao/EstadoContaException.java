package excecao;

public class EstadoContaException extends Exception {

	public EstadoContaException(int estado) {
		super("Impossível acessar conta. Favor verifica o estado.");
	}

}
