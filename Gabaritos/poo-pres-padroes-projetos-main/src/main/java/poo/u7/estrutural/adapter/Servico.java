package poo.u7.estrutural.adapter;

import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Servico {

    private static final Logger LOG = Logger.getLogger(Servico.class.getName());

    public void analisarDadosEmJson(String dados) throws JsonMappingException, JsonProcessingException {
        // validando formato
        if (dados.contains("<stock>")) {
            LOG.severe("ERRO: Format de dados inválido!\n");

            return;
        } else {
            LOG.info("INFO: formato aceito com sucesso!");
        }

        // converter dados de JSON para objeto
        ObjectMapper mapper = new ObjectMapper();
        Stock stock = mapper.readValue(dados, Stock.class);

        LOG.info("Objeto: " + stock);

    }
}
