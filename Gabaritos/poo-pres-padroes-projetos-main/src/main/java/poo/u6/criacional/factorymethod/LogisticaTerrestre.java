package poo.u6.criacional.factorymethod;

public class LogisticaTerrestre extends Logistica {

    @Override
    Transporte criarTransporte() {
        var caminhao = new Caminhao();

        caminhao.transportar();

        return caminhao;
    }

}
