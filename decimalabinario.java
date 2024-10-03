import java.util.Scanner;

public class decimalabinario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número decimal y te diré su binario");
        int numerodecimal = teclado.nextInt();
        int resto;
        int binario = 0;
        int exp = 0;

        while(numerodecimal != 0){

            resto = numerodecimal%2;
            binario = binario + resto *(int)Math.pow(10, exp);
            exp++;
            numerodecimal/=2;
            
        }
        System.out.println(binario);
        teclado.close();

    }
    
}
