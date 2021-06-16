package poo.u6.criacional.abstractfactory;

public class MainCliente {

    public static void main(String[] args) {

        // (1) mapeamento
        // cadeira sofa mesa
        // simpĺes x x x -> fábrica simples
        // vitoriano x x x -> fabrica vitoriana
        // moderno x x x -> fabrica moderna

        // cliente simples
//        var sofa = new SofaSimples();
//        var cadeira = new CadeiraVitoriana();
//        var mesa = new MesaSimples();

        FabricaMoveis simples = new FabricaMoveisSimples();
        var cadeira = simples.criarCadeira();
        var mesa = simples.criarMesa();
        var sofa = simples.criarSofa();

        cadeira.sentar();
        mesa.prepararParaUmLanche();
        sofa.sentarComConforto();

        // cliente - moveis modernos
        FabricaMoveis moderna = new FabricaMoveisModerna();
        var cadeira2 = moderna.criarCadeira();
        var mesa2 = moderna.criarMesa();
        var sofa2 = moderna.criarSofa();

        cadeira2.sentar();
        mesa2.prepararParaUmLanche();
        sofa2.sentarComConforto();

        // cliente - moveis vitorianos
        FabricaMoveis vitoriana = new FabricaMoveisVitoriana();
        var cadeira3 = vitoriana.criarCadeira();
        var mesa3 = vitoriana.criarMesa();
        var sofa3 = vitoriana.criarSofa();

        cadeira3.sentar();
        mesa3.prepararParaUmLanche();
        sofa3.sentarComConforto();
    }

}
