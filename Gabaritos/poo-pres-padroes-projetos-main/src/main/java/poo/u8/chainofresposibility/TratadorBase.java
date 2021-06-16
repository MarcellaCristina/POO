package poo.u8.chainofresposibility;

public abstract class TratadorBase implements Tratador{
	
	private Tratador proximo;
	
	@Override
	public void setProximo(Tratador t) {
		this.proximo = t;
	}
	
	@Override
	public void tratar(Requisicao r) {
		this.proximo.tratar(r);
	}

}
