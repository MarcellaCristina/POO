package und3.atividadeEditora;

public class Artigo {
    
    private String id, autor, conteudo, data;

    public Artigo(String id, String a, String c, String d) {
        this.autor = a;
        this.conteudo = c;
        this.id = id;
        this.data = d;
    }

    public String getData() {
        return data;
    }
    public String getId() {
        return id;
    }
    public String getConteudo() {
        return conteudo;
    }

    public void obterTamanho() {
        
        int tamanho = this.conteudo.length();
        int tamanhoSemEspaco = conteudo.replace(" ", "").length();

        System.out.println("O conte√∫do do artigo possui " + tamanho + " caracteres, contando os espa√ßos.\nE " + tamanhoSemEspaco + " caracteres, descartando os espa√ßos.");
    }

    @Override
    public String toString() {
        return "Artigo n∫ " + id + " sobre '" + conteudo + "' ser· publicado por " + autor + " no dia " + data + ".";
    }
}
