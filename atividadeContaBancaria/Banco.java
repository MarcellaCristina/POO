package und2.atv2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Banco {
	private Scanner sc = new Scanner(System.in);

	private String banco;

	private List<ContaBancaria> contas = new ArrayList<>();

	/**
	 * @param banco
	 */
	// construtor customizado
	public Banco(String nome_banco) {
		this.banco = nome_banco;
		System.out.println("\nBem vindo ao Banco " + banco + "!\n");
	}



	public ContaBancaria pesquisarPorConta(String numero) {
		// percorrendo a lista
		// iterando sobre as contas, laço de repetição		
		for (ContaBancaria conta : contas) {
			if (conta.getNumero().equals(numero)) {
				return conta;
			}
		}

		return null; // conta não encontrada
	}

	// adicionar a conta na lista
	public boolean inserirNovaConta(ContaBancaria nova_conta) {
		contas.add(nova_conta);
		return true;

	}

	public boolean atualizarDadosConta(ContaBancaria conta) {

		// sobrescreve ela com os atributos atualizados
		//assumimos que os unicos dados que podem ser alterados, são do Correntista,
		//pelo fato do numero da conta ser gerado automaticamente e a número da Agencia não poder ser alterado.

		String escolha;

		System.out.println("Deseja atualizar o nome do Correntista? Sim ou Não");
		escolha = sc.nextLine();
		if (escolha.equalsIgnoreCase("sim")) {
			System.out.println("Digite o nome do Correntista");
			escolha = sc.nextLine();
			conta.getCorrentista().setNome(escolha);
			escolha = null;
			System.out.println("\nDados Atualizados com sucesso!\n");
		}
		System.out.println("Deseja atualizar o CPF do Correntista? Sim ou Não");
		escolha = sc.nextLine();
		if (escolha.equalsIgnoreCase("sim")) {
			System.out.println("Digite o CPF do Correntista");
			escolha = sc.nextLine();
			conta.getCorrentista().setCpf(escolha);
			escolha = null;
			System.out.println("\nDados Atualizados com sucesso!\n");
		}

		System.out.println("Nome do Correntista: " + conta.getCorrentista().getNome());
		System.out.println("CPF do Correntista: " + conta.getCorrentista().getCpf());
		System.out.println("\n");

		return true;
	}

	public boolean encerrarConta(String numero) {
		// pesquisa
		ContaBancaria conta = this.pesquisarPorConta(numero);
		// remove a conta da lista
		if(conta == null) {
			System.out.println("Conta inexistente!\n");
			return false;
		}
		else {
			this.contas.remove(conta);
			System.out.println("Conta removida!\n");
		}

		return false;

	}

	public boolean transferir(String origem, String destino, float valor) {
		//fazer a pesquisa pra as duas contas
		//buscar a conta de origem

		ContaBancaria contaOrigem = this.pesquisarPorConta(origem);
		ContaBancaria contaDestino = this.pesquisarPorConta(destino);
		if(contaOrigem == null || contaDestino == null) {
			System.out.println("\nContas não encontradas!\n");
			return false;
			
		}
		else if(contaOrigem.getSaldo() < valor){
			System.out.println("\nSaldo Insuficiente!\n");
			return false;
		
		
			
		}
		else if(valor < 0 ) {
			System.out.println("\nValor Inválido\n");
			return false;		
			
		}
		
		else {			
			contaOrigem.efetuarSaque(valor);			
			contaDestino.efetuarDeposito(valor);			
			contaOrigem.inserirNoExtrato(LocalDate.now(), "Transferência", valor);
			return true;
		}

	}

	public void exibirRelatorioContas() {
		for (ContaBancaria conta : contas) {
			System.out.println(conta);
		}
	}

	public String getBanco() {
		return banco;
	}
}
