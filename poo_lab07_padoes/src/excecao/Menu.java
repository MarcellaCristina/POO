package excecao;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		var conta = new ContaBancaria(200);

		while (true) {
			
			try { // tentativa de execução que pode lançar uma exceção

				var valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque: "));
				// tentar efetuar o saque
				conta.efetuarSaque(valor);

				JOptionPane.showMessageDialog(null,
						"Saque efetuado com sucesso: " + valor + "\nSaldo: " + conta.getSaldo());

			} catch (ValorSaqueInvalidoException ex) { // capturar as excecoes
				// exibir a mensagem na tela
				JOptionPane.showMessageDialog(null, ex.getMessage());
			} 
//			catch (SaldoInsuficienteException ex2) {
//				JOptionPane.showMessageDialog(null, ex2.getMessage());
//			}
			finally {
				// encerra qualquer operação realizada no bloco try
				System.out.println("Sempre executa");
				conta.incrementarContadorOperacoes();
			}
		}
	}
}
