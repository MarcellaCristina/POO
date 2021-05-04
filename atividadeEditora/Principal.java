package und3.atividadeEditora;

public class Principal {
    public static void main(String[] args) {
        
        Editora e = new Editora("50", "Mulheres Ricas", "Rua dos Ricos nº 55, Bairro Nova Iorque - MG");
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("                    EDITORA " + e.getNome() + "                   ");
        System.out.println( "-----------------------------------------------------------------");
    
        System.out.println(e);
        System.out.println( "---------------------------------------------------------------------------------------------\n");

        
        Artigo a1 = new Artigo("2", "Manoel", "Viagens Internacionais", "10/03/2021");
        Artigo a3 = new Artigo("10", "Luana", "Como adestrar o seu pet", "07/06/2021");
        Revista r1 = new Revista("150", "Cara", a1);       
        e.adicionarRevista(r1);
        r1.pesquisarArtigo("2");
        r1.pesquisarArtigo("22");
        r1.adicionarArtigo(a1);
        r1.adicionarArtigo(a3);
        r1.imprimirArtigos();
        a1.obterTamanho();
        a3.obterTamanho();

        System.out.println();
        System.out.println( "---------------------------------------------------------------------------------------------");
        System.out.println();

        Artigo a2 = new Artigo("5", "Thaís", "Moda Verão", "25/03/2021");
        Revista r2 = new Revista("171", "Veja", a2);
        e.adicionarRevista(r2);
        r2.adicionarArtigo(a1);
        r2.pesquisarArtigo("2");
        r2.imprimirArtigos();
        a2.obterTamanho();

        System.out.println();
        System.out.println( "---------------------------------------------------------------------------------------------");
        System.out.println();

        e.imprimirRevistas();
        System.out.println( "---------------------------------------------------------------------------------------------");
    }
}
