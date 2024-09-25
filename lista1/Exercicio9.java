import java.util.Scanner;

public class Exercicio9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nStart;
        int nEnd;

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if(n1>n2){
            nStart = n2;
            nEnd = n1;
        } else {
            nStart = n1;
            nEnd = n2;
        }

        int sum = nStart;
        int aux = 0;
        
        for(int i = nStart; i < nEnd; i++){
            sum += aux;
            aux = sum;

            System.out.println(sum);
        }
    }
}
