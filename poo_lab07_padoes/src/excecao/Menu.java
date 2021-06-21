package excecao;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		var conta = new ContaBancaria(200,1);

		while (true) {
			
			try { // tentativa de execução que pode lançar uma exceção

				var valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque: "));
				// tentar efetuar o saque
				conta.efetuarSaque(valor);

				JOptionPane.showMessageDialog(null,
						"Saque efetuado com sucesso: " + valor + "\nSaldo: " + conta.getSaldo());

			} catch (EstadoContaException ex1) {
				JOptionPane.showMessageDialog(null, ex1.getMessage());
				
			}catch (ValorSaqueInvalidoException ex2) { // capturar as excecoes
				// exibir a mensagem na tela
				JOptionPane.showMessageDialog(null, ex2.getMessage());
			} 
			catch (ValorSaldoInsuficienteException ex3) {
				JOptionPane.showMessageDialog(null, ex3.getMessage());
				
			}
			finally {
				// encerra qualquer operação realizada no bloco try
				System.out.println("Sempre executa");
				conta.incrementarContadorOperacoes();
			}
		}
	}
}
