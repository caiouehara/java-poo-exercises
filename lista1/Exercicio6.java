public class Exercicio6 {
    // Calcular a quantidade de números primos entre 200 e 2000
    
    public static void main(String[] args) {
        int entrada = Integer.parseInt(args[0]);

        System.out.print(Integer.toString((entrada % 100)).substring(0, 1));
    }
}
