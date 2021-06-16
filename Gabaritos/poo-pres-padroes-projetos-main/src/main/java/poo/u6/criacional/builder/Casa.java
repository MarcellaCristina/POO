package poo.u6.criacional.builder;

// classe/objeto complexo - dividir em fases
public class Casa {

    private Integer janelas;
    private Integer portas;
    private Integer quartos;
    private Boolean possuiGaragem;
    private Boolean possuiPiscina;
    private Boolean possuiJardim;
    private Boolean possuiPortao;
    private Boolean possuiHidromassagem;

    // construtor telescópio (code smell, acima de 6)
    public Casa(Integer janelas, Integer portas, Integer quartos, Boolean possuiGaragem, Boolean possuipiscina,
            Boolean possuiJardim, Boolean possuiPortao) {
        super();
        this.janelas = janelas;
        this.portas = portas;
        this.quartos = quartos;
        this.possuiGaragem = possuiGaragem;
        this.possuiPiscina = possuipiscina;
        this.possuiJardim = possuiJardim;
        this.possuiPortao = possuiPortao;
    }

    public Casa() {
    }

    public Integer getJanelas() {
        return janelas;
    }

    public void setJanelas(Integer janelas) {
        this.janelas = janelas;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Integer getQuartos() {
        return quartos;
    }

    public void setQuartos(Integer quartos) {
        this.quartos = quartos;
    }

    public Boolean getPossuiGaragem() {
        return possuiGaragem;
    }

    public void setPossuiGaragem(Boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }

    public Boolean getPossuiPiscina() {
        return possuiPiscina;
    }

    public void setPossuiPiscina(Boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }

    public Boolean getPossuiJardim() {
        return possuiJardim;
    }

    public void setPossuiJardim(Boolean possuiJardim) {
        this.possuiJardim = possuiJardim;
    }

    public Boolean getPossuiPortao() {
        return possuiPortao;
    }

    public void setPossuiPortao(Boolean possuiPortao) {
        this.possuiPortao = possuiPortao;
    }

    public void setPossuiHidromassagem(Boolean possuiHidromassagem) {
        this.possuiHidromassagem = possuiHidromassagem;
    }

    public Boolean getPossuiHidromassagem() {
        return possuiHidromassagem;
    }

    @Override
    public String toString() {
        return "Casa [janelas=" + janelas + ", portas=" + portas + ", quartos=" + quartos + ", possuiGaragem="
                + possuiGaragem + ", possuiPiscina=" + possuiPiscina + ", possuiJardim=" + possuiJardim
                + ", possuiPortao=" + possuiPortao + ", possuiHidromassagem=" + possuiHidromassagem + "]";
    }

}
