package poo.u6.criacional.singleton;

public class BancoDeDados {

    // (1) atributo estático privado
    private static BancoDeDados instance;

    private String nome;

    // (4) construtor privado da classe
    private BancoDeDados(String nome) {
        this.nome = nome;
    }

    // (2) método publico estático para acessar a instância
    public static BancoDeDados getInstance() {
        // se a instancia ainda nao foi criada, criar ela
        // (3) inicialização atrasada
        if (instance == null) {
            instance = new BancoDeDados("holerite");
        }

        // retornar a instância
        return instance;
    }

    public void conectar() {
        System.out.println("Conexão bem-sucedida.");
    }
}
