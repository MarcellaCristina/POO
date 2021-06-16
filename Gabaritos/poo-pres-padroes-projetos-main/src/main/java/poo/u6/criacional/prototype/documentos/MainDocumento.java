package poo.u6.criacional.prototype.documentos;

import java.time.LocalDate;

public class MainDocumento {

    public static void main(String[] args) {
        
        var original = new Documento("001", "Passaporte", "José Pereira", LocalDate.now());
        System.out.println(original);
        System.out.println();
        
        var copia = (Documento) original.clonar();
        System.out.println(copia);
        System.out.println();
        
        copia.setNome("Maria Gonçalves");

        // == tipos primitivos
        // equals() -> objetos
        
        // verificar a autenticidade do documento
        if (copia.equals(original)) { 
            System.out.println("INFO: cópia igual a documento original.\n");
        } else {
            System.out.println("ALERTA: cópia fraudada!\n");
        }
    }
}
