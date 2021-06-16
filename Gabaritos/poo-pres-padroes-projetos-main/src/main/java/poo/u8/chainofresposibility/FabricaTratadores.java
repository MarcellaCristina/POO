package poo.u8.chainofresposibility;

public class FabricaTratadores {

	/**
	 * Cria a cadeia de tratadores.
	 * 
	 * @return
	 */
	public static Tratador getCadeiaTratadores() {
		var tratadorUsuario = new TratadorUsuarioValido();
		var tratadorAutenticacao = new TratadorAutenticacao();
		var tratadorAutorizacao = new TratadorPerfil();
		var tratadorDataInicio = new TratadorDataInicio();
		var tratadorDataFim = new TratadorDataFim();
		
		tratadorUsuario.setProximo(tratadorAutenticacao);
		tratadorAutenticacao.setProximo(tratadorAutorizacao);
		tratadorAutorizacao.setProximo(tratadorDataInicio);
		tratadorDataInicio.setProximo(tratadorDataFim);
		
		return tratadorUsuario;
	}
}
