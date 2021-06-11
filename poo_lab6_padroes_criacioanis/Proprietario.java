package builder;


public class Proprietario {
	 private VeiculoBuilder builder;

	    public Proprietario(VeiculoBuilder builder) {
	        this.builder = builder;
	    }
	    
	 // (4) criar diferentes tipos de objetos complexos
	    public Veiculo construir (String tipo) {
	    	builder.init();
	    	
	    	if(tipo.toLowerCase().equals("popular")) {
	    		builder.portas (2);
	    		builder.janelas (4);
	    		builder.rodas (4);
	    		builder.marca ("Renault");
	    		builder.modelo ("Kwid");
	    		builder.ano (2020);
	    		builder.km (0);
	    		builder.potencialEmHp (70);
	    		builder.cor ("Branco");
	    		builder.arCondicionado(false);
	    	}
	    	else if(tipo.toLowerCase().equals("importado")) {
	    		builder.portas (2);
	    		builder.janelas (4);
	    		builder.rodas (4);
	    		builder.marca ("Renault");
	    		builder.modelo ("Kwid");
	    		builder.ano (2020);
	    		builder.km (0);
	    		builder.potencialEmHp (70);
	    		builder.cor ("Branco");
	    		builder.arCondicionado(true);
	    	}
	    	else {
	    		System.out.println("ERRO: tipo ainda não suportado: " + tipo);
	    		return null;
	    	}
	    	return builder.build();
		}
	    
	    
	    

}
