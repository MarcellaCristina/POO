package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public interface Requisicao {

	String getUser();
	
	String getPassword();
	
	String getRole();
	
	LocalDateTime getInicioAcesso();
	
	LocalDateTime getFimAcesso();
}
