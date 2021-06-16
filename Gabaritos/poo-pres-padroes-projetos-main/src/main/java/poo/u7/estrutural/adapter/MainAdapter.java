package poo.u7.estrutural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

public class MainAdapter {

    public static void main(String[] args) {
        var cliente = new Cliente();

        var servico = new Servico();

        // formato incompatível
        String dados = null;

        try {
            dados = cliente.fornecerDadosEmXml();
            servico.analisarDadosEmJson(dados);
        } catch (JsonProcessingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // usando adapter
        AdapterXmlToJson adapter = new AdapterXmlToJsonImpl(servico);

        try {
            adapter.adaptarDados(dados);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
