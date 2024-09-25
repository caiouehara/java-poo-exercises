public class Exercicio2 {
    // Calcular o fatorial do número inserido n
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = 1;
        
        for(int i=1; i<=n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
