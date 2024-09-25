import java.util.Scanner;

public class Exercicio10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres (string): ");
        String line = sc.nextLine();

        char c;
        for(int i=0; i < line.length(); i++){
            int ascii = (int) line.charAt(i);
            System.out.println(line.charAt(i) + " = " + ascii);
        }

    }   
}