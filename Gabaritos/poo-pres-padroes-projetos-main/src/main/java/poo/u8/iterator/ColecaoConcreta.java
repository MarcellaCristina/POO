package poo.u8.iterator;

public class ColecaoConcreta implements IterableCollection<String>{

	private String[] valores;
	
	private int index;
	
	public ColecaoConcreta(int tamanho) {
		this.valores = new String[tamanho];
	}
	
	@Override
	public Iterator<String> criarIterator() {
		return new IteratorConcreto(this);
	}

	public void adicionar(String s) {
		this.valores[index] = s;
		index++;
	}
	
	public String remover() {
		var valor = this.valores[index];
		
		this.index--;
		
		return valor;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String[] getValores() {
		return valores;
	}
}
