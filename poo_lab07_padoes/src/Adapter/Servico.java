package adapter;

import java.nio.charset.StandardCharsets;

//serviço recebe uma cadeia de caracteres em forma de número
public class Servico {

 public void processarDados(String ascii) {

     for (int i = 0; i < ascii.length(); i++) {
         byte[] bytes = ascii.getBytes(StandardCharsets.US_ASCII);
         System.out.println("ASCII Numeric Value: " + bytes[i]);
     }
 }

}