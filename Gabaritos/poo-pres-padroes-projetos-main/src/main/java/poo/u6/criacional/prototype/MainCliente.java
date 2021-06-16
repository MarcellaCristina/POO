package poo.u6.criacional.prototype;

public class MainCliente {

    public static void main(String[] args) {
        var c1 = new Circulo(3, 4, "verde", 10);
        System.out.println(c1);
        System.out.println();

        // forma tradicional de clonar/copiar um objeto
        var copia2 = new Circulo(c1.x, c1.y, c1.cor, c1.raio);

        var copia = c1.clonar();
        System.out.println(copia);
        System.out.println();

        var protRet = new Retangulo(5, 8, "amarelo", 12, 5);
        System.out.println(protRet);
        System.out.println();

        copia = protRet.clonar();
        System.out.println(copia);
        System.out.println();
    }
}
