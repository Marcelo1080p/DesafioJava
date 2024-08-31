package Models;

public class Cliente {
  private String nome;
  private String cpf;
  private double saldo;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.saldo = 0.0;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
