package poo.u6.criacional.abstractfactory;

//(2b) fazer a classe concreta implementar a interface do produto
public class CadeiraVitoriana implements Cadeira {

    @Override
    public void sentar() {
        System.out.println(this.getClass().getSimpleName() + ": sentando");
    }

}
