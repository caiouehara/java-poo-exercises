
public class Exercicio {
    public static void main(String args[]){
        Pessoa pessoa1 = new Pessoa("Caio", 11, "55631013877");
        Pessoa pessoa2 = new Pessoa("Neusa", 13, "4463010233");

        System.out.format("Nome: %s \n", pessoa1.getNome());
        System.out.format("CPF: %s \n", pessoa1.getCpf());
        System.out.format("Idade: %d\n", pessoa1.getIdade());

        System.out.println();

        System.out.format("Nome: %s \n", pessoa2.getNome());
        System.out.format("CPF: %s \n", pessoa2.getCpf());
        System.out.format("Idade: %d", pessoa2.getIdade());
    }
}