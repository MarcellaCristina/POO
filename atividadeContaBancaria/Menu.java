package und2.atv2;

import java.util.Scanner;



public class Menu {

	private Scanner sc = new Scanner(System.in);
	Banco banco;
	ContaBancaria conta;
	int opcao1 = 0;
	Correntista correntista = null;
	

	public Menu() {
		System.out.println("Seja Bem vindo!");
		System.out.println("Digite o nome do banco:");    
        String bancoDigitado = sc.nextLine();
        this.banco = new Banco(bancoDigitado); 
		
	}
	
	// Menu Banco
	public void exibirMenuPrincipal() {
		
		System.out.println("1. Pesquisar por conta");
		System.out.println("2. Inserir nova conta");
		System.out.println("3. Encerrar conta");
		System.out.println("4. Operar sobre conta");
		System.out.println("5. Sair");

		System.out.println("\nEscolha uma das opções acima:");
	}
	
	//menu cadastro
	public void exibirMenuCadastroConta() {
		System.out.println("1. Cadastrar correntista");
		System.out.println("2. Cadastrar conta bancária");
		System.out.println("3. Retornar");
		
	}
	//menu conta
	public void exibirMenuDeConta() {
		System.out.println("1. Efetuar saque");
		System.out.println("2. Efetuar depósito");
		System.out.println("3. Exibir saldo em conta");
		System.out.println("4. Exibir extrato em conta");
		System.out.println("5. Efetuar Pagamento");
		System.out.println("6. Transferir entre contas");
		System.out.println("7. Atualizar Dados da Conta");
		System.out.println("8. Retornar");

		System.out.println("\n\nEscolha uma das opções acima:");
	}

	
	public void iniciarOperacao() {		
		
		while (opcao1 != 5) {
			this.exibirMenuPrincipal();
			opcao1 = sc.nextInt();
			switch (opcao1) {
			
			case 1: //pesquisar
				sc.nextLine();
				System.out.println("\nDigite o número da conta que deseja pesquisar:");
				String numero = sc.nextLine();
				banco.pesquisarPorConta(numero);
				break;
				
			case 2: // cadastro	
				sc.nextLine();
				System.out.println("\n");
				this.cadastroConta(banco);				
				break;
				
			case 3: //encerrar conta
				sc.nextLine();
				System.out.println("\nDigite o número da conta que deseja encerrar:");
				String numero2 = sc.nextLine();
				banco.encerrarConta(numero2);				
				break;
			
			case 4: // operar sobre a conta
				sc.nextLine();
				System.out.println("\nDigite o número da conta:");
				var numeroDigitado = sc.nextLine();
				System.out.println("\n");
				this.conta = banco.pesquisarPorConta(numeroDigitado);
				if (conta != null) {
					this.operarSobreConta(conta);
				} else {
					System.out.println("\nConta não encontrada!\n");
				}
				opcao1 = 0;
				break;
				
			case 5: // sair..
				System.out.println("Saindo do sistema...");
				System.out.println("Até logo!");
				opcao1 = 0;
				System.exit(0);
				break;
			default:
				System.out.println("ALERTA: operação inválida.\n");
			}
		}

		
	}

	public void cadastroConta(Banco banco) {
		int opcao2=0;
		
		while (opcao2 != 3) {
			this.exibirMenuCadastroConta();
			opcao2 = sc.nextInt();
			
			switch (opcao2) {
			case 1: //cadastro correntisata
				sc.nextLine();
				System.out.println("\nDigite o nome do correntista:");
				var nome = sc.nextLine();
				System.out.println("\nDigite o CPF:");
				var cpf = sc.nextLine();	
				this.correntista = new Correntista(nome,cpf);
				System.out.println("\nCorrentista criado com sucesso! " + correntista + "\n");				
				opcao1 = 0;
				break;
			
			case 2: // cadastro conta
				if (correntista == null) {
					System.out.println("ALERTA: o correntista deve ser criado antes da conta.\n");
				} else {
					sc.nextLine();										
					System.out.println("\nDigite o numero da agência:");
					var agencia = sc.nextLine();
					System.out.println("\n");
					this.conta = new ContaBancaria(agencia, correntista, this.banco);
					this.banco.inserirNovaConta(conta);							
					correntista = null;
				}
				opcao1 = 0;
				break;
			
			case 3: //retornar
				sc.nextLine();
				System.out.println("Saindo do menu de conta . . .\n\n");				
				break;
			default:
				System.out.println("ALERTA: Operação inválida");
				break;
			}
		}
	}
		
	public void operarSobreConta(ContaBancaria conta) {
		int opcao3 = 0;

		while (opcao3 != 8) {
			this.exibirMenuDeConta();

			opcao3 = sc.nextInt();

			switch (opcao3) {
			case 1: // saque
			System.out.println("Digite o valor a ser sacado:");
			var saque = sc.nextFloat();
			System.out.println("\n");
			if(conta.efetuarSaque(saque) == true) {
				System.out.println("Saque realizada com sucesso!\n");				
			} else {
				System.out.println("Transação não realizada!\n");
			}
			opcao3 = 0;
			break;
			
			case 2: // deposito
				System.out.println("Digite o valor a ser depositado:");
				var deposito = sc.nextFloat();
				System.out.println("\n");
				if (conta.efetuarDeposito(deposito) == true) {
					System.out.println("Depósito realizada com sucesso!\n");
				} else {
					System.out.println("Transação não realizada!\n");
				}
				opcao3 = 0;
				break;
				
			case 3: // saldo
				conta.exibirSaldo();
				opcao3 = 0;
				break;
				
			case 4: // extrato
				conta.exibirExtrato();
				opcao3 = 0;
				break;
				
			case 5: // pagamento
				sc.nextLine();
				System.out.println("Digite o valor da conta:\n");
				var valorConta = sc.nextFloat();
				System.out.println("\n");
				conta.efetuarPagamento(valorConta, "Boleto");
				opcao3 = 0;
				break;
				
			case 6: // transferencia
				sc.nextLine();
				System.out.println("Digite a conta de origem:");
				var contaOrigem = sc.nextLine();
				System.out.println("\n");
				System.out.println("Digite a conta de destino:");
				var contaDestino = sc.nextLine();
				System.out.println("\n");
				System.out.println("Digite o valor que deseja transferir:");
				var valor = sc.nextFloat();				
				if(banco.transferir(contaOrigem, contaDestino, valor) == true) {
					System.out.println("\nTransferência realizada!\n");
				} else {
					System.out.println("Transferência não realizada!\n");
				}
				
				break;

			case 7: //atualizar conta
				sc.nextLine();
				banco.atualizarDadosConta(this.conta);
				opcao3 = 0;
				break;

			case 8: // sair
				sc.nextLine();
				System.out.println("Saindo do menu de conta . . .\n\n");
				
				break;
			default:
				System.out.println("ALERTA: Operação inválida");
			}
			
		}
		
	}
}
