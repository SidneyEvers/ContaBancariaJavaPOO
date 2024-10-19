public class Pessoa {

    private String nome;
    private int Idade;
    private Double salarioMensal;

    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public Double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Double salarioMensal) {
        this.nome = nome;
        Idade = idade;
        this.salarioMensal = salarioMensal;
    }

    
    
    

    
    
}
