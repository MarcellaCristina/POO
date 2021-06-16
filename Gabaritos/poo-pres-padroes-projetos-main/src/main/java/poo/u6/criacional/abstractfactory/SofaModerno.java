package poo.u6.criacional.abstractfactory;

//(2b) fazer a classe concreta implementar a interface do produto
public class SofaModerno implements Sofa {

    @Override
    public void sentarComConforto() {
        System.out.println(this.getClass().getSimpleName() + ": sentar com conforto");
    }

}
