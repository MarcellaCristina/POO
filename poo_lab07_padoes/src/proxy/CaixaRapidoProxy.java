package proxy;

import java.util.*;

//validar a senha do cartão e código de letras(3) antes de iniciar as operações
//validação a cada 3 minutos

//OBJETO PROXY
public class CaixaRapidoProxy implements Banco {

 // Criar uma classe de proxy, com um atributo referenciando a classe de serviço
 private ContaBancaria contaBancaria;

 private String senha;
 private String codLetras;

 Timer timer = new Timer();

 public CaixaRapidoProxy(ContaBancaria contaBancaria, String senha, String codLetras) {
     this.contaBancaria = contaBancaria;
     this.senha = senha;
     this.codLetras = codLetras;
     initComponents();
 }

 private void initComponents() {
 } // ??

 public ContaBancaria getContaBancaria() {
     return this.contaBancaria;
 }

 public void setContaBancaria(ContaBancaria contaBancaria) {
     this.contaBancaria = contaBancaria;
 }

 public String getSenha() {
     return this.senha;
 }

 public void setSenha(String senha) {
     this.senha = senha;
 }

 public String getCodLetras() {
     return this.codLetras;
 }

 public void setCodLetras(String codLetras) {
     this.codLetras = codLetras;
 }

 // Implementar os métodos da classe proxy, delegando o trabalho para a classe de
 // serviço
 @Override
 public void efetuarSaque() {
     if (contaBancaria.getSenha().equals(this.getSenha())
             && contaBancaria.getCodLetras().equals(this.getCodLetras())) {
         System.out.println("Acesso para saque liberado!");
         timer.schedule(new TimerTask() {
             @Override
             public void run() {
                 timer.purge();
                 System.out.println("Tempo esgotado!");
             }
         }, 5000); // 5 segundos esgota o tempo
     } else {
         System.out.println("Acesso para saque NEGADO!");
     }
 }

 @Override
 public void efetuarDeposito() {
     if (contaBancaria.getSenha().equals(this.getSenha())
             && contaBancaria.getCodLetras().equals(this.getCodLetras())) {
         System.out.println("Acesso para depósito liberado!");

         timer.schedule(new TimerTask() {
             @Override
             public void run() {
                 timer.purge();
                 System.out.println("Tempo esgotado!");
             }
         }, 5000); // 5 segundos esgota o tempo
     } else {
         System.out.println("Acesso para depósito NEGADO!");
     }
 }

 @Override
 public void efetuarTransferencia() {
     if (contaBancaria.getSenha().equals(this.getSenha())
             && contaBancaria.getCodLetras().equals(this.getCodLetras())) {
         System.out.println("Acesso para transferência liberado!");
         timer.schedule(new TimerTask() {
             @Override
             public void run() {
                 timer.purge();
                 System.out.println("Tempo esgotado!");
             }
         }, 5000); // 5 segundos esgota o tempo
     } else {
         System.out.println("Acesso para transferência NEGADO!");
     }
 }

 @Override
 public void alterarDadosPessoais() {
     if (contaBancaria.getSenha().equals(this.getSenha())
             && contaBancaria.getCodLetras().equals(this.getCodLetras())) {
         System.out.println("Acesso para alterar dados liberado!");

         timer.schedule(new TimerTask() {
             @Override
             public void run() {
                 timer.purge();
                 System.out.println("Tempo esgotado!\n");
             }
         }, 5000); // 5 segundos esgota o tempo
     } else {
         System.out.println("Acesso para alterar dados NEGADO! \n\n");
     }
 }

}
