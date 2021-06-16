package poo.u8.chainofresposibility;

public interface Tratador {

	void setProximo(Tratador t);
	
	void tratar(Requisicao r);
}
