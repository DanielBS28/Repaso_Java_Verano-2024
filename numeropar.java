import java.util.Scanner;

public class numeropar {

    static boolean numeropar (int numero){

        if (numero % 2==0) 
            return true;
            else 
            return false;
        
    }

    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner (System.in);
        System.out.println("Dime un número y te diré si es par o impar");
        int numero = teclado.nextInt();
        boolean espar = numeropar(numero);

        if (espar) 
            System.out.println("El número " + numero +" es par");
        else
        System.out.println("El número " + numero +" no es par");

        
    }
}
