package poo.u8.iterator;

public class IteratorConcreto implements Iterator<String>{

	private ColecaoConcreta colecao;
	
	private int index = 0;
	
	public IteratorConcreto(ColecaoConcreta colecao) {
		this.colecao = colecao;
	}
	
	@Override
	public String getNext() {
		if (index == colecao.getIndex()) {
			System.out.println("ERROR: não existem mais elementos.\n");
			
			return null;
		}
		
		var valor = colecao.getValores()[index];
		index++;
		
		return valor;
	}

	@Override
	public boolean hasMore() {
		return index < colecao.getIndex();
	}

}
