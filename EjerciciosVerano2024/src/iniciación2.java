import java.util.Scanner;

public class iniciación2 {

    public static void main(String[] args) {

        int contador = 0;
        int numero;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Dime un número y te diré cuantas cifras tiene, tiene que ser positivo");
            numero = teclado.nextInt();

            if (numero < 0) {
                System.out.println("El número tiene que ser positivo");
            }

        } while (numero < 0);

        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("El numero tiene " + contador + " " + (contador == 1 ? "cifra" : "cifras"));

        teclado.close();

    }

}
