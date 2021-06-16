package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public class RequisicaoUsuario implements Requisicao {

	private String user;
	private String password;
	private String role;
	private LocalDateTime inicioAcesso;
	private LocalDateTime fimAcesso;
	
	public RequisicaoUsuario(String user, String password, String role, LocalDateTime inicioAcesso,
			LocalDateTime fimAcesso) {
		super();
		this.user = user;
		this.password = password;
		this.role = role;
		this.inicioAcesso = inicioAcesso;
		this.fimAcesso = fimAcesso;
	}

	@Override
	public String getUser() {
		return this.user;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getRole() {
		return this.role;
	}

	@Override
	public LocalDateTime getInicioAcesso() {
		return this.inicioAcesso;
	}

	@Override
	public LocalDateTime getFimAcesso() {
		return this.fimAcesso;
	}

	@Override
	public String toString() {
		return "RequisicaoUsuario [user=" + user + ", password=" + password + ", role=" + role + ", inicioAcesso="
				+ inicioAcesso + ", fimAcesso=" + fimAcesso + "]";
	}
}
