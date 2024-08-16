public class Series1 {
    public static void main(String[] args) {
        double sum = 0;
        
        for(double i = 1; i <= 35; i++){
            if(i%2 == 0){
                sum -= (i*5)/(i+1);
            }
            else{
                sum += (i*5)/(i+1);
            }
        }
        
        System.out.println(sum);
    }
}