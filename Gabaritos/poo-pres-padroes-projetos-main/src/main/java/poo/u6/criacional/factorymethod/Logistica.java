package poo.u6.criacional.factorymethod;

public abstract class Logistica {

    public void planejarEntrega() {
        criarTransporte();
    }

    // (2) acrescentar o metodo de fábrica abstrato
    abstract Transporte criarTransporte();
}
