package proxy;

public class Main {    public static void main(String[] args) {

        Cliente cliente = new Cliente("Tales", "Rua Palácio nº 10", "(33) 99999-9999");

        ContaBancaria conta = new ContaBancaria("1097-9", "26199-8", "910615", "ABC");
        conta.setCliente(cliente);
        System.out.println("Cliente da Conta Bancária: " + conta.getCliente());

        cliente.setContaBancaria(conta);
        System.out.println("Conta Bancária - " + cliente.getContaBancaria());

        CaixaRapidoProxy caixa = new CaixaRapidoProxy(conta, "910615", "ABC");
        caixa.efetuarSaque();
        caixa.efetuarDeposito();
        caixa.efetuarTransferencia();
        caixa.alterarDadosPessoais();

        // cliente 2 que terá o acesso negado pois a senha está incorreta

        Cliente cliente2 = new Cliente("Luana", "Rua Castelo nº 5", "(31) 88888-9999");

        ContaBancaria conta2 = new ContaBancaria("558009-5", "2200-7", "010402", "IDE");
        conta2.setCliente(cliente2);
        System.out.println("Cliente da Conta Bancária: " + conta2.getCliente());

        cliente2.setContaBancaria(conta2);
        System.out.println("Conta Bancária - " + cliente2.getContaBancaria());

        CaixaRapidoProxy caixa2 = new CaixaRapidoProxy(conta2, "010400", "IDE");
        caixa2.efetuarSaque();
        caixa2.efetuarDeposito();
        caixa2.efetuarTransferencia();
        caixa2.alterarDadosPessoais();
    }
}