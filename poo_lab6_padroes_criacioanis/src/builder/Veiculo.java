package builder;


//Classe complexa, com vários atributos
public class Veiculo {

	private int portas;
	private int janelas;
	private int rodas;
	private String marca;
	private String modelo;
	private int ano;	
	private int km;
	private int potenciaEmHp;
	private String cor;
	private Boolean arCondicionado;


	public Veiculo(int portas, int janelas, int rodas, String marca, String modelo, int ano, int km, int potenciaEmHp,
			String cor, Boolean arCondicionado) {
		super();
		this.portas = portas;
		this.janelas = janelas;
		this.rodas = rodas;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
		this.potenciaEmHp = potenciaEmHp;
		this.cor = cor;
		this.arCondicionado = arCondicionado;
	}


	public Boolean getArCondicionado() {
		return arCondicionado;
	}


	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}


	public Veiculo() {
	}

	public int getPortas() {
		return portas;
	}


	public void setPortas(int portas) {
		this.portas = portas;
	}


	public int getJanelas() {
		return janelas;
	}


	public void setJanelas(int janelas) {
		this.janelas = janelas;
	}


	public int getRodas() {
		return rodas;
	}


	public void setRodas(int rodas) {
		this.rodas = rodas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public int getPotenciaEmHp() {
		return potenciaEmHp;
	}


	public void setPotenciaEmHp(int potenciaEmHp) {
		this.potenciaEmHp = potenciaEmHp;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nPortas: " + portas + "\nJanelas: " + janelas + "\nRodas: " + rodas
				+ "\nKm: " + km + "\nPotenciaEmHp: " + potenciaEmHp + "\nAr Condicionado: " + arCondicionado;
	}
}
