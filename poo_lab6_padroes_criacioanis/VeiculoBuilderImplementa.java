package builder;


//classe que implementa a interface Builder
public class VeiculoBuilderImplementa implements VeiculoBuilder, VeiculoImportado {
	
	
	private Veiculo v; //variavél do tioi Veiculo que será usada para a construução do objeto
	
	 @Override
	    public void init() { //metodo para a criação do objeto através do construtor padrão, sem parametros.
	        this.v = new Veiculo(); 
	    }

	@Override
	public void portas(int portas) {
		v.setPortas(portas);
		
	}

	@Override
	public void janelas(int janelas) {
		v.setJanelas(janelas);
		
	}

	@Override
	public void rodas(int rodas) {
		v.setRodas(rodas);
		
	}

	@Override
	public void marca(String marca) {
		v.setMarca(marca);
		
	}

	@Override
	public void modelo(String modelo) {
		v.setModelo(modelo);
		
	}

	@Override
	public void ano(int ano) {
		v.setAno(ano);
		
	}

	@Override
	public void km(int km) {
		v.setKm(km);
		
	}

	@Override
	public void potencialEmHp(int potenciaEmHp) {
		v.setPotenciaEmHp(potenciaEmHp);
		
	}

	@Override
	public void cor(String cor) {
		v.setCor(cor);
		
	}
		
	@Override
	public void arCondicionado(Boolean arCondicionado) {
		v.setArCondicionado(arCondicionado);
		
	}

	@Override
	public Veiculo build() {
		return v;
	}

}
