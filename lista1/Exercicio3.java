public class Exercicio3 {
    // Calcular a quantidade de números primos entre 200 e 2000
    
    public static void main(String[] args) {        
        int sum = 0;
        int count = 0;
        Boolean isPrime = true;
        
        for(int i=200; i<=2000; i++){
        
            isPrime = true;
            for(int k=2; k<i; k++){
                if(i % k == 0){
                    isPrime = false;
                    break;
                }

            }

            if(isPrime){
                sum += i;
                count++;
            }
        }

        System.out.printf("O resultado da soma do fatorial foi de %d \n", sum);
        System.out.printf("Nesse intervalo, existe %d números primos", count);
    }
}
