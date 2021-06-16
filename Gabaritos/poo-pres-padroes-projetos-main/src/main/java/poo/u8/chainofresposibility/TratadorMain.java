package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public class TratadorMain {

	public static void main(String[] args) {
		
		var tratador = FabricaTratadores.getCadeiaTratadores();
		
		// objeto de requisição
		var requisicao = new RequisicaoUsuario("joao.borges", "123456", "analista", LocalDateTime.of(2022, 10, 2, 8, 0), LocalDateTime.of(2020, 11, 3, 12, 0));
		
		tratador.tratar(requisicao);
	}
}
