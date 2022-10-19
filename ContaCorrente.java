public class ContaCorrente extends Conta {

	public ContaCorrente(double saldoInicial){
		super(saldoInicial);
	  }
  @Override
  public void atualiza(double tax) {
    super.atualiza(2*tax);
  }

  @Override
  public void depositar(double deposit) {
    super.depositar(deposit - 0.1);
  }
}

