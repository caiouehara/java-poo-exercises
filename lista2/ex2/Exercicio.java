
public class Exercicio {
    public static void print(Pessoa pessoa){
        System.out.println();
        System.out.format("Nome: %s \n", pessoa.getNome());
        System.out.format("CPF: %s \n", pessoa.getCpf());
        System.out.format("Idade: %d", pessoa.getIdade());
    }
    public static void main(String args[]){
        Pessoa pessoa1 = new Pessoa("Caio", 11, "55631013877");
        Pessoa pessoa2 = new Pessoa("Neusa", 13, "4463010233");

        print(pessoa1);
        print(pessoa2);
    }
}