public class Volume {
    public static void main(String[] args) {
        double volume = 0;
        double R3 = 0;

        System.out.println();
        for(double i = 0; i <= 20; i=i+0.5){
            R3 = Math.pow((i), 3);
            volume =  4.0/3.0 * Math.PI * R3;
            
            System.out.println(volume);
        }
    }
}
