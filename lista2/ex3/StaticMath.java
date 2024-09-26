public class StaticMath {
    double PI = 3.1424122131;
    double euler = 2.78128;

    public static double potencia(double base, double expoente){
        int result = 0;
        for(int i=0; i < expoente; i++){
            result += base * base;
        }
        return result;
    }    

    public static int maximo(int number1, int number2){
        if(number2 > number1){
            return number2;
        } else {
            return number1;
        }
    }

    public static int minimo(int number1, int number2){
        if(number2 < number1){
            return number2;
        } else {
            return number1;
        }
    }

    public static int absoluto(int number){
        if(number < 0){
            return -number;
        } else {
            return number;
        }
    }

    public static double multiplicar(double number1, double number2){
        return number1 * number2;
    }
}
