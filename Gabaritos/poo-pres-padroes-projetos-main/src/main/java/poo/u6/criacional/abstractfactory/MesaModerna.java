package poo.u6.criacional.abstractfactory;

//(2b) fazer a classe concreta implementar a interface do produto
public class MesaModerna implements Mesa {

    @Override
    public void prepararParaUmLanche() {
        System.out.println(this.getClass().getSimpleName() + ": preparando para um lanche");
    }

}
