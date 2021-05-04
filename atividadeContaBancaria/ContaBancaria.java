package und2.atv2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {

	private static int quantidade = 0;

	// vari�veis - atributos
	private Banco banco;
	private String agencia;
	private String numeroConta;
	private float saldo;

	private Correntista correntista;

	// lista de Strings
	private List<String> entradasExtrato = new ArrayList<>();

	// construtores
	/**
	 * @param banco
	 * @param agencia
	 * @param numeroConta
	 * @param saldo
	 */
	public ContaBancaria(String agencia, Correntista correntista, Banco banco) {
		quantidade++;

		this.banco = banco;
		this.agencia = agencia;
		this.numeroConta = String.format("%05d", quantidade) + "-1"; // 00005
		this.saldo = 0.0f;

		this.correntista = correntista;
		System.out.println("Conta criada com sucesso! " + "Conta: " + numeroConta + "\n");

	}

	// m�todos

	public void inserirNoExtrato(LocalDate data, String descricao, float valor) {

		entradasExtrato.add(String.format("%12s - %15s - R$ %5.2f", data, descricao, valor));
	}

	public boolean efetuarSaque(float valor) {
		if (valor <= 0) { // nao pode ser negativo
			System.out.println("ALERTA: valor de saque inv�lido!\n");
			return false;
		} else if (saldo < valor) { // nao pode ser maior que o saldo
			System.out.println("ALERTA: Saldo insuficiente!\n");
			return false; // saque n�o efetuado
		}
		else {
			saldo = saldo - valor;
			// inserir saque no extrato
			var data = LocalDate.now();
			var descricao = "Saque";
			this.inserirNoExtrato(data, descricao, -valor);
			return true;
		}
		
	}


	public boolean efetuarDeposito(float valor) {
		
		if (valor <= 0) { // nao pode ser negativo	
			System.out.println("ALERTA: valor inv�lido!\n");
			return false;
		} else {
			saldo = saldo + valor;
			this.inserirNoExtrato(LocalDate.now(), "Dep�sito", valor);
			return true;

		}
		/*if(resultado == "0") {
			System.out.println("ALERTA: valor de dep�sito inv�lido!\n");
			resultado = null;
		}
		if (resultado == "1") {
			System.out.println("Dep�sito realizada com sucesso!\n");
			resultado = null;
		}*/
			
		//return true;					
		
	}
	
	

	public boolean efetuarPagamento(float valor, String descricao) {
		// saque do valor
		boolean resultado = this.efetuarSaque(valor);

		if (!resultado) {
			System.out.println("ALERTA: n�o foi poss�vel efetuar o pagamento.\n");
			return false;
		} else {
			System.out.println("Pagamento realizada com sucesso!\n");
			inserirNoExtrato(LocalDate.now(), "Pagamento", valor);
		}
		

		return true;
	}

	public void exibirSaldo() {
		System.out.println(String.format("Saldo em conta: R$%5.2f", saldo));
		System.out.println("\n");
	}

	public void exibirExtrato() {
		System.out.println("==============================");
		System.out.println("Banco " + banco.getBanco());
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("N�mero da conta: " + numeroConta);
		System.out.println("Correntista: " + correntista.getNome());

		System.out.println("\n\n");

		for (int i = 0; i < entradasExtrato.size(); i++) {
			System.out.println(entradasExtrato.get(i));
		}

		exibirSaldo();

		System.out.println("==============================");
	}




	@Override
	public String toString() {
		return "ContaBancaria [banco=" + banco.getBanco() + ", agencia=" + agencia + ", numero=" + numeroConta
				+ ", saldo=" + saldo;

	}

	public String getNumero() {
		return numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public float getSaldo() {
		return saldo;
	}


}