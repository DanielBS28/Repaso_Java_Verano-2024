import java.util.Scanner;

public class iniciacion4 {

    public static void main(String[] args) {

        int numero, sumatorio = 0, cifras = 0, digito, auxnumero, sumatoriototal = 0;

        String resultado = "";
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(
                    "Introduce un número si su suma es igual a su número de cifras lo incluimos en un sumatorio, acabaremos cuando introduzcas un 0");

            numero = teclado.nextInt();

            auxnumero = numero;

            if (auxnumero > 0) {

                while (auxnumero != 0) {
                    digito = auxnumero % 10;
                    auxnumero = auxnumero / 10;
                    cifras++;
                    sumatorio = sumatorio + digito;
                }

                if (sumatorio == cifras) {

                    sumatoriototal += numero;
                    resultado += (numero + " + ");
                }

            }

            sumatorio = 0;
            cifras = 0;

        } while (numero != 0);

        System.out.println("La suma total es: " + resultado + "\b\b = " + sumatoriototal);

        teclado.close();

    }

}
