public class Conta {
  private double saldo = 0;

  public Conta(double saldoInicial){
      this.saldo = saldoInicial;
  }

  private void setSaldo(double balance) {
    this.saldo = balance;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void depositar(double deposit) {
    setSaldo(getSaldo() + deposit);
    System.out.println("Você depositou com sucesso!");
  }

  public void sacar(double withdraw) {
    if(withdraw < 0) {
      System.out.println("Valor para a operação inválido");
    }

    setSaldo(getSaldo() - withdraw);
    System.out.println("Você sacou com sucesso!");
  }

  public void atualiza(double tax){
    setSaldo(getSaldo()+getSaldo()*tax/100);
  }
}

