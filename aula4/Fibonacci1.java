public class Fibonacci1 {
    public static void main(String[] args) {
        int next = 0;
        int past = 0;
        int aux = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println(next);

            aux = next;
            next += past;
            past = aux;

            if(i==0){
                next += 1;
            }

        }
    }
}
