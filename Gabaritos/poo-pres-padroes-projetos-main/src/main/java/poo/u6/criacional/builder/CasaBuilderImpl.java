package poo.u6.criacional.builder;

// (3) criar uma classe builder a partir da interface
public class CasaBuilderImpl implements CasaBuilder, KitLuxo {

    // classe/objeto complexo
    private Casa casa;

    @Override
    public void init() {
        this.casa = new Casa();
    }
    
    @Override
    public void comJanelas(Integer janelas) {
        casa.setJanelas(janelas);
    }

    @Override
    public void comPortas(Integer portas) {
        casa.setPortas(portas);
    }

    @Override
    public void comQuartos(Integer quartos) {
        casa.setQuartos(quartos);
    }

    @Override
    public void comGaragem(Boolean possui) {
        casa.setPossuiGaragem(possui);
    }

    @Override
    public void comPiscina(Boolean possui) {
        casa.setPossuiPiscina(possui);
    }

    @Override
    public void comJardim(Boolean possui) {
        casa.setPossuiJardim(possui);
    }

    @Override
    public void comPortao(Boolean possui) {
        casa.setPossuiPortao(possui);
    }

    @Override
    public Casa build() {
        return casa;
    }

    @Override
    public void comHidromassagem(Boolean com) {
        casa.setPossuiHidromassagem(com);
    }

}
