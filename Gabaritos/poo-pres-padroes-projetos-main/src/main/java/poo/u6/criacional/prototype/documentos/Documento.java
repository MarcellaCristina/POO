package poo.u6.criacional.prototype.documentos;

import java.time.LocalDate;

import poo.u6.criacional.prototype.Prototype;

public class Documento implements Prototype{

    private String id;
    
    private String tipo;
    
    private String nome;
    
    private LocalDate data;

    public Documento(String id, String tipo, String nome, LocalDate data) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Documento [id=" + id + ", tipo=" + tipo + ", nome=" + nome + ", data=" + data + "]";
    }

    public Documento(Documento original) {
        this.id = original.id;
        this.tipo = original.tipo;
        this.nome = original.nome;
        this.data = original.data;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof Documento)) {
            return false;
        }
        
        var outro = (Documento) obj;
        // TODO Auto-generated method stub
        return this.id.equals(outro.id) &&
                this.nome.equals(outro.nome) &&
                this.data.equals(outro.data) &&
                this.tipo.equals(outro.tipo);
    }
    
    @Override
    public Prototype clonar() {
        return new Documento(this);
    }        
}
