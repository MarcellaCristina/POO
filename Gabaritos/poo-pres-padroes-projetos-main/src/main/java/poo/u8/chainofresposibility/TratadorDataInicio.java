package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public class TratadorDataInicio extends TratadorBase{
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");

		var agora = LocalDateTime.now();
		
		if (r.getInicioAcesso().isAfter(agora)) {
			System.out.println("ERRO: inicio acesso não permitido - " + r.getInicioAcesso());
			
			// sair da cadeia
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
