public class ContaPoupanca extends Conta{

    public ContaPoupanca(){

    }
    public ContaPoupanca(Double saldoEmConta, Pessoa dono) {
        super(saldoEmConta, dono);
    }

    public ContaPoupanca(String nome, int idade, Double salario, Double saldoEmConta){
        super(nome, idade, salario, saldoEmConta);
    }

    @Override
    public void Saque(Double valor) {
        
        setSaldoEmConta(getSaldoEmConta() - valor - 8.00d);
    }


    
}
