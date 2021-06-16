package poo.u6.criacional.builder;

public class Diretor {

    private CasaBuilder builder;

    public Diretor(CasaBuilder builder) {
        this.builder = builder;
    }

    // (4) criar diferentes tipos de objetos complexos
    public Casa construir(TipoCasa tipo) {
        builder.init();
        
        if (tipo.equals(TipoCasa.SIMPLES)) {
            builder.comQuartos(2);
            builder.comJanelas(4);
            builder.comPortas(2);
            builder.comGaragem(false);
            builder.comJardim(false);
            builder.comPiscina(false);
            builder.comPortao(true);

            //builder.comHidromassagem(false);
        } else if (tipo.equals(TipoCasa.MANSAO)) {
            builder.comQuartos(10);
            builder.comJanelas(20);
            builder.comPortas(6);
            builder.comGaragem(true);
            builder.comJardim(true);
            builder.comPiscina(true);
            builder.comPortao(true);

            //builder.comHidromassagem(true);
        } else if (tipo.equals(TipoCasa.MEDIA)) {
            System.out.println("ERRO: tipo ainda não suportado: " + tipo);
            
            return null;
        }

        return builder.build();
    }
}
