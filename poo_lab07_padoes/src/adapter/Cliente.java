package adapter;

//fornece cadeia de caracteres String
public class Cliente {

 public String fornecerDados;

 public String getFornecerDados() {
     return this.fornecerDados;
 }

 public String setFornecerDados(String fornecerDados) {
     return this.fornecerDados = fornecerDados;
 }

 @Override
 public String toString() {
     return "{" + " fornecerDados='" + getFornecerDados() + "'" + "}";
 }

}