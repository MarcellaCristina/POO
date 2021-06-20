package proxy;

public class Cliente {

    private String nome;
    private String endereco;
    private String telefone;

    private ContaBancaria contaBancaria;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContaBancaria getContaBancaria() {
        return this.contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", endereco='" + getEndereco() + "'" + ", telefone='" + getTelefone()
                + "'" + "}";
    }

}
