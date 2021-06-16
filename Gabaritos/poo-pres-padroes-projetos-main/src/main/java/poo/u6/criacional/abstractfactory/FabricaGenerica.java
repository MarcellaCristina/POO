package poo.u6.criacional.abstractfactory;

public abstract class FabricaGenerica {

    public void produzir() {
        System.out.println("Produzindo . . . .");
    }

    public abstract String getTipo();
}
