import java.util.Scanner;

public class tablamultiplicar {

static void tablamultiplicar (int numero){

    System.out.println("Tabla de multiplicar del número " + numero);

    for (int i = 0; i < 1; i++) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(numero + " x " + j + " = " + (j * numero));
        }
    }
}

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime un número y te daré la tabla de multiplicar del 1 al 10 ese número");
        int numero = teclado.nextInt();
        tablamultiplicar(numero);

        teclado.close();

    }
    
}
