import java.util.Scanner;

public class Exercicio {    
    public static double calcularSalario(Pessoa pessoa){
       return (double) pessoa.getQuantidadeHoraTrabalhada() * pessoa.getSalarioHora();
    }

    public static void print(Pessoa pessoa){
        System.out.println();
        System.out.format("Nome: %s \n", pessoa.getNome());
        System.out.format("CPF: %s \n", pessoa.getCpf());
        System.out.format("Idade: %d\n", pessoa.getIdade());
        System.out.format("Salário: %.2f", calcularSalario(pessoa));
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nome;
        
        System.out.format("Digite o nome:");
        nome = sc.nextLine();
        
        do {
            int idade;
            String cpf;
            int quantidadeDeHorasTrabalhadas;
            double salarioHora;

            System.out.format("Digite a idade:");
            idade = Integer.parseInt(sc.nextLine());

            System.out.format("Digite o CPF:");
            cpf = sc.nextLine();

            System.out.format("Digite a quantidade de horas trabalhadads:");
            quantidadeDeHorasTrabalhadas = Integer.parseInt(sc.nextLine());

            System.out.format("Digite o salário hora:");
            salarioHora = Double.parseDouble(sc.nextLine());


            Pessoa pessoa = new Pessoa(
                nome, 
                idade, 
                cpf, 
                quantidadeDeHorasTrabalhadas,
                salarioHora
            );

            print(pessoa);

            System.out.format("Digite o nome:");
            nome = sc.nextLine();
        } while(!nome.equals("fim"));
    }
}