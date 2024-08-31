package Models;

public class Transacao extends Taxa {

  public Transacao(float valorTaxa) {
    super(valorTaxa);
  }

  public void realizarSaque(Cliente cliente, Empresa empresa, double valorTransacao) {
    if (cliente.getSaldo() >= valorTransacao && valorTransacao > valorTaxa) {
      double novoSaldoCliente = cliente.getSaldo() - valorTransacao;
      double novoSaldoEmpresa = empresa.getSaldo() + (valorTransacao - valorTaxa);

      cliente.setSaldo(novoSaldoCliente);
      empresa.setSaldo(novoSaldoEmpresa);

      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente ou valor de transação inválido.");
    }
  }

  public void realizarDeposito(Cliente cliente, Empresa empresa, double valorDeposito) {
    if (valorDeposito > valorTaxa) {
      double novoSaldoCliente = cliente.getSaldo() - valorDeposito;
      double novoSaldoEmpresa = empresa.getSaldo() + (valorDeposito - valorTaxa);

      cliente.setSaldo(novoSaldoCliente);
      empresa.setSaldo(novoSaldoEmpresa);

      System.out.println("Depósito realizado com sucesso!");
    } else {
      System.out.println("O valor para depósito deve ser maior que a taxa.");
    }
  }
}
