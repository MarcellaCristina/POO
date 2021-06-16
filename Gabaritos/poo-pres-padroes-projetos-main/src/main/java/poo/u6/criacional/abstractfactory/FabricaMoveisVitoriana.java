package poo.u6.criacional.abstractfactory;

//(4) implementar a classe concreta de fábrica implementando a interface
public class FabricaMoveisVitoriana implements FabricaMoveis {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaVitoriana();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaVitoriano();
    }

}
