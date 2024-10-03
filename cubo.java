public class cubo {

    static double cubo (double numero){

        return Math.pow(numero, 3);
    }

    public static void main(String[] args) {
        
        double numero = 2;
        System.out.println(cubo(numero));
    }
    
}
