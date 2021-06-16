package poo.u7.estrutural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

// (1) definir uma interface de cliente
public interface AdapterXmlToJson {

    String adaptarDados(String xml) throws JsonMappingException, JsonProcessingException;
}
