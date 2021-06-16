package poo.u6.criacional.factorymethod;

public class LogisticaMaritima extends Logistica {

    @Override
    Transporte criarTransporte() {
        var navio = new Navio();

        navio.transportar();

        return navio;
    }

}
