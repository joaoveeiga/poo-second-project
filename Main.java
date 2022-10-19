public class Main {
  
  public static void main(String[] args){
   Conta pessoaUm = new Conta(200.0);
   ContaPoupanca pessoaDois = new ContaPoupanca(100.0);
   ContaCorrente pessoaTres = new ContaCorrente(5.0);


   System.out.println("Saldo da Primeira Pessoa: R$"+pessoaUm.getSaldo());
   System.out.println("Saldo da Segunda Pessoa: R$"+pessoaDois.getSaldo());
   System.out.println("Saldo da Terceira pessoa: R$"+pessoaTres.getSaldo());

   pessoaUm.atualiza(10.0);
   pessoaDois.atualiza(10.0);
   pessoaTres.atualiza(10.0);

   System.out.println("Saldo da Primeira Pessoa: R$"+pessoaUm.getSaldo());
   System.out.println("Saldo da Segunda Pessoa: R$"+pessoaDois.getSaldo());
   System.out.println("Saldo da Terceira pessoa: R$"+pessoaTres.getSaldo());

 
  }
}

