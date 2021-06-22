package adapter;

public class MainAdapter {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Servico servico = new Servico();

        String dados = "";

        dados = cliente.setFornecerDados("CcAa");

        // usando o adapter
        AdapterStringToAscii adapter = new AdapterImpl(servico);
        adapter.adaptarDados(dados);
    }
}

