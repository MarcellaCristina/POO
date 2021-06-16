package poo.u6.criacional.abstractfactory;

// (4) implementar a classe concreta de fábrica implementando a interface
public class FabricaMoveisSimples extends FabricaGenerica implements FabricaMoveis {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraSimples();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaSimples();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaSimples();
    }

    public void quebrarFabrica() {
        System.out.println("Quebra!!!");
    }

    @Override
    public String getTipo() {
        return "simples";
    }

}
