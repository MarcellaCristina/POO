package poo.u6.criacional.singleton;

import java.util.Arrays;

public class MainCliente {

    public static void main(String[] args) {
//
//        var d1 = BancoDeDados.getInstance();
//        d1.conectar();
//        System.out.println(d1);
//        System.out.println();
//
//        var d2 = BancoDeDados.getInstance();
//        d2.conectar();
//        System.out.println(d2);
//        System.out.println();

//        var d3 = new BancoDeDados();
        var lista = Arrays.asList("1", "2", "3", "4");

        // Java 8 Streams APIs
        lista.parallelStream().forEach(item -> {
            var instance = BancoDeDados.getInstance();
            System.out.println(item + ": " + instance);
        });
    }
}
