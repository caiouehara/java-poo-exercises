public class Pessoa {
    private String nome;
    private int idade;
    final String cpf;
    private int quantidadeDeHorasTrabalhadas;
    private double salarioHora;

    
    Pessoa(String nome, int idade, String cpf, int quantidadeDeHorasTrabalhadas, double salarioHora){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getQuantidadeHoraTrabalhada(){
        return this.quantidadeDeHorasTrabalhadas;
    }

    public double getSalarioHora(){
        return this.salarioHora;
    }

    public void setSalarioHora(double valor){
        this.salarioHora = valor;
    }

    public void setQuantidadeHoraTrabalhada(int valor){
        this.quantidadeDeHorasTrabalhadas = valor;
    }
       
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(String nome){
        this.nome = nome;
    } 
}