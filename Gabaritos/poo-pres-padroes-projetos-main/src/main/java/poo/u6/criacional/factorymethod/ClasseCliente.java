package poo.u6.criacional.factorymethod;

public class ClasseCliente {

    public static void main(String[] args) {

        // (4) usar o metodo de fábrica para criar os produtos
        Logistica logistica = new LogisticaAerea();
        logistica.planejarEntrega();
        var transporte = logistica.criarTransporte();
        System.out.println(transporte);
        System.out.println();

        logistica = new LogisticaMaritima();
        logistica.planejarEntrega();
        transporte = logistica.criarTransporte();
        System.out.println(transporte);
        System.out.println();

        logistica = new LogisticaTerrestre();
        logistica.planejarEntrega();
        transporte = logistica.criarTransporte();
        System.out.println(transporte);
        System.out.println();
    }

}
