
package adapter;

//2. classe que implementa a interdace adapter
public class AdapterImpl implements AdapterStringToAscii {

 // 3. atributo da classe Serviço
 private Servico servico;

 public AdapterImpl(Servico servico) {
     this.servico = servico;
 }

 // implementa os métodos da interface adapter
 @Override
 public String adaptarDados(String ascii) {

     // dados originais String
     System.out.println("Dado original: " + ascii);

     // adaptar os dados

     servico.processarDados(ascii);

     return ascii;

 }

}
