package poo.u6.criacional.builder;

// (1) definir os passos de construção do objeto complexo
// (2) declarar uma interface com os passos
public interface CasaBuilder {

    void init();
    
    void comJanelas(Integer janelas);

    void comPortas(Integer portas);

    void comQuartos(Integer quartos);

    void comGaragem(Boolean possui);

    void comPiscina(Boolean possui);

    void comJardim(Boolean possui);

    void comPortao(Boolean possui);

    Casa build(); // construção e retorno do objeto complexo criado
}
