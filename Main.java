import Models.Cliente;
import Models.Empresa;
import Models.Transacao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcelo", "123.456.789-00");
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99");

        cliente.setSaldo(1000.0);
        empresa.setSaldo(5000.0);

        Transacao transacao = new Transacao(5.0f);

        transacao.realizarDeposito(cliente, empresa, 200.0);

        transacao.realizarSaque(cliente, empresa, 100.0);

        System.out.println("Saldo do Cliente: " + cliente.getSaldo());
        System.out.println("Saldo da Empresa: " + empresa.getSaldo());
    }
}
