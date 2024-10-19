abstract class Conta implements Funcoes{


    private Double saldoEmConta;
    private Pessoa dono;
    
    public Conta() {
    }

    public Conta(Double saldoEmConta, Pessoa dono) {
        
        this.saldoEmConta = saldoEmConta;
        this.dono = dono;
    }
    
    public Conta(String nome, int idade, Double salario, Double saldoEmcConta){
        this.dono = new Pessoa(nome, idade, salario);
        this.saldoEmConta = saldoEmcConta;
    }


    public void UpdatePessoa(String nome, int idade, Double salario){
        dono.setNome(nome);
        dono.setIdade(idade);
        dono.setSalarioMensal(salario);
    }
    
    public void UpdatePessoa(String nome){
        dono.setNome(nome);
    }

    public void UpdatePessoa(int idade){
        dono.setIdade(idade);
    }
    public void UpdatePessoa(Double salario){
        dono.setSalarioMensal(salario);
    }



    public Double getSaldoEmConta() {
        return saldoEmConta;
    }
    public void setSaldoEmConta(Double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }
    

    public void Operacao(int operacao, Double valor){

        if(operacao == 1){
            Deposito(valor);

            System.out.println(getSaldoEmConta());
        }
        else if(operacao == 2){
            Saque(valor);
            System.out.println(getSaldoEmConta());
        }
    }


    @Override
    public void Deposito(Double valor) {
        setSaldoEmConta(getSaldoEmConta() + valor);

    }

    @Override
    public void Saque(Double valor) {
        setSaldoEmConta(getSaldoEmConta() - valor);
    }


    public void Extrato(){

        System.out.println("O saldo atual da conta é: " + saldoEmConta);
    }
    
    


}
