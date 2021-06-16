package poo.u7.estrutural.adapter;

public class Stock {

    private String id;
    private float valor;
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Stock [id=" + id + ", valor=" + valor + ", data=" + data + "]";
    }

}
