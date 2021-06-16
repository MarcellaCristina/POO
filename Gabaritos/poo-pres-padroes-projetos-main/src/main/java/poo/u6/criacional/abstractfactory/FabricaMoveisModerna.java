package poo.u6.criacional.abstractfactory;

//(4) implementar a classe concreta de fábrica implementando a interface
public class FabricaMoveisModerna implements FabricaMoveis {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }

}
