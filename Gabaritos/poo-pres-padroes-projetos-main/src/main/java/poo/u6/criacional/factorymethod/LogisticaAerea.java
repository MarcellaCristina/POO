package poo.u6.criacional.factorymethod;

public class LogisticaAerea extends Logistica {

    @Override
    Transporte criarTransporte() {
        var a = new Aviao();

        a.transportar();

        return a;
    }

}
