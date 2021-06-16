package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public class TratadorDataFim extends TratadorBase { 
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");
		var agora = LocalDateTime.now();
		
		if (r.getFimAcesso().isBefore(agora)) {
			System.out.println("ERRO: acesso não é mais permitido - " + r.getFimAcesso());
			
			
			// sair da cadeia
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
