package poo.u6.criacional.builder;

public class ClasseCliente {

    public static void main(String[] args) {

        // (5) criação do builder e do diretor.
        CasaBuilder builder = new CasaBuilderImpl();

        var diretor = new Diretor(builder);

        var casaSimples = diretor.construir(TipoCasa.SIMPLES);
        System.out.println(casaSimples);
        System.out.println();

        var mansao = diretor.construir(TipoCasa.MANSAO);
        System.out.println(mansao);
    }

}
