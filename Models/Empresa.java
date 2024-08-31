package Models;

public class Empresa {
  private String nome;
  private String cnpj;
  private double saldo;

  public Empresa(String nome, String cnpj) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.saldo = 0.0;
  }

  public String getNome() {
    return nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
