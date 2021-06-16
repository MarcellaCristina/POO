package poo.u8.chainofresposibility;

import java.util.Arrays;
import java.util.List;

public class TratadorPerfil extends TratadorBase {
	
	private List<String> perfisValidos = Arrays.asList("presidente", "diretor", "gerente", "supervisor");
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");
		
		if (!perfisValidos.contains(r.getRole())) {
			System.out.println("ERRO: perfil inválido - " + r.getRole());
			
			// sair da cadeia
			return ;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
