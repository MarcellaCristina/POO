package und3.atividadeEditora;

import java.util.*;

public class Editora {

    private String id, nome, endereco;
    private List<Revista> revistas;

    public Editora(String id, String n, String e) {
        this.id = id;
        this.nome = n;
        this.endereco = e;

        this.revistas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Revista pesquisarRevista(String id) {
        for(Revista r : revistas) {
            if(r.getId().equals(id)) {
                return r;
            }         
        }
        return null; 
    }

    public void adicionarRevista(Revista r) {
        Revista existe = pesquisarRevista(r.getId());
        if(existe != null) {
            System.out.println("A revista de edição nº " + r.getId() + " foi encontrada.\n");
            return;
        }
        this.revistas.add(r);
        System.out.println("Revista '" + r.getNome() + "' adicionada a editora '"  + getNome() + "' ainda não foi publicada.\n");
    }

    public void imprimirRevistas() {
        for(Revista r : revistas) {
            System.out.println(r);
        }
    }

    public String toString() {
        return "\nA editora '" + nome + "' está localizada em " + endereco + ".\n";
    }
}