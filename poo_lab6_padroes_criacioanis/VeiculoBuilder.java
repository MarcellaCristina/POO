package builder;


//(1) definir os passos de construção do objeto complexo
//(2) declarar uma interface com os atributos em forma de método
public interface VeiculoBuilder {
	
	void init(); //método para criar o objeto
	
	void portas ( int portas);
	void janelas (int janelas);
	void rodas (int rodas);
	void marca (String marca);
	void modelo (String modelo);
	void ano (int ano);
	void km (int km);
	void potencialEmHp (int potencialEmHp);
	void cor (String cor);
	void arCondicionado(Boolean arCondicionado);
	
	Veiculo build(); //construção e retorno do objeto complexo Veículo
	
	
	
	

}
