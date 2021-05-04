package und3.atividadeEditora;


import java.util.*;

public class Revista {

	private String id, nome;
	private List<Artigo> artigos = new ArrayList<>();

	public Revista(String id, String n, Artigo ar) { // composi��o, obrigat�rio criar a revista com o artigo
		this.nome = n;
		this.id = id;
		this.artigos.add(ar);
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Artigo pesquisarArtigo(String id) {
		//boolean achou = false;
		for(Artigo a : artigos) {
			if(a.getId().equals(id)) {
				return a;				
			}	

		}
		return null;

	}                




	public void adicionarArtigo(Artigo a) {
		Artigo existe = pesquisarArtigo(a.getId());
		if(existe != null) {
			System.out.println("Artigo " + a.getId() + " j� publicado na revista " + nome + "\n");
			return;
		}
		this.artigos.add(a);
		System.out.println("Artigo n� " + a.getId() + " publicado na revista " + nome + "\n");
	}

	public void imprimirArtigos() {
		for(Artigo a : artigos) {
			System.out.println(a + " Pertence � revista " + nome);
		}
	}

	public String toString() {
		return "Revista '" + nome + "' edi��o n� " + id + " foi publicada.\n";
	}
}
