import java.util.Scanner;

public class Exercicio8 {    
    public static void main(String args[]){
        String nome = "";
        String cpf = "44631013877";
        String data_de_nascimento = "12/09/2002";
        String endereco = "Av. Luigi Rosiello 204";
        String cidade = "Ribeirão Preto";
        String line = "";
        Integer idade = 0;
        String[] data_de_nascimento_parseada;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Calculador de idade ----");
        System.out.println("Olá, tudo bem?");
        System.out.println(" > Qual seu nome?");
        
        line = sc.nextLine();
        if (line.length() >= 2) {
            nome = line;
        } 

        System.out.println(" > Qual seu CPF?");
        line = sc.nextLine();
        if (line.length() == 11) {
            cpf = line;
        } 

        System.out.println(" > Qual sua data de nascimento?");
        line = sc.nextLine();
        if (line.length() > 10) {
            data_de_nascimento_parseada = line.split("/");
            if (Integer.parseInt(data_de_nascimento_parseada[3]) > 2024) {
                data_de_nascimento = line;
            }
        }
        data_de_nascimento_parseada = data_de_nascimento.split("/");

        System.out.println(" > Qual seu endereço?");
        line = sc.nextLine();
        if (line.length() <= 2) {
            endereco = line;
        } 

        System.out.println(" > Qual sua cidade?");
        line = sc.nextLine();
        if (line.length() <= 2) {
            cidade = line;
        } 

        System.out.format(" - Olá %s \n", nome);
        System.out.format(" - Seu CPF é %s \n", cpf);
        System.out.format(" - Seu endereço é %s \n", endereco);
        System.out.format(" - Sua cidade é %s \n", cidade);

        int dif_dia = 25 - Integer.parseInt(data_de_nascimento_parseada[0]);
        int dif_mes = 9 - Integer.parseInt(data_de_nascimento_parseada[1]);
        int dif_ano = 2024 - Integer.parseInt(data_de_nascimento_parseada[2]);
        
        if(dif_dia > 0 && dif_mes > 0){
            idade = dif_ano;
        } else {
            idade = dif_ano - 1;
        }

        System.out.format(" - Você tem %d anos", idade);
    }
}
