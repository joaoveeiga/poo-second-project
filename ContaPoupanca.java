public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldoInicial){
		super(saldoInicial);
	  }
  @Override
  public void atualiza(double tax){
    super.atualiza(3*tax);
  }
  
}

