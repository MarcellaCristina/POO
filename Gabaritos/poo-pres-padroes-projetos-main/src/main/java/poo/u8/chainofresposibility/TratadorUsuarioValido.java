package poo.u8.chainofresposibility;

public class TratadorUsuarioValido extends TratadorBase {
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");
		
		var user = "joao.pereira";
		
		// usuário não existe
		if (!user.equals(r.getUser())) {
			System.out.println("ERRO: usuário inválido");

			// sair da cadeia.
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
