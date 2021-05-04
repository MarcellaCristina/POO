package und2.atv2;

import java.util.Scanner;

public class Correntista {
	  private static int quantidade = 0;

	    private String nome;
	    private String cpf;

	    /**
	     * @param nome
	     * @param cpf
	     */
	    public Correntista(String nome, String cpf) {
	        quantidade++;
	        this.nome = nome;
	        this.cpf = cpf;
	        

	    }
	   

	/*public Correntista efetuarCadastroCorrentista(String nome_correntista, String cpf_correntista) {

			var correntista = new Correntista(nome_correntista, cpf_correntista);
			this.nome = nome_correntista;
			this.cpf = cpf_correntista;

			System.out.println("Correntista criado com sucesso: \n" + correntista + "\n");

			return correntista;
		}*/

	    
		@Override
	    public String toString() {
	        return "[nome=" + nome + ", CPF=" + cpf + "]";
	    }

	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public String getCpf() {
	        return cpf;
	    }
	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

}
