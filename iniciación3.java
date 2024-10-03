import java.util.Scanner;

public class iniciación3 {

    public static void main(String[] args) {

        int numeroIntroducido = 0;
        int sumatorio =0;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Dime un número, pararemos el programa cuando sea menor o igual que cero y te daré la suma de los introducidos");
            numeroIntroducido = teclado.nextInt();

            if (numeroIntroducido > 0) {
                sumatorio += numeroIntroducido;
            }

        } while (numeroIntroducido > 0);

        System.out.println("La suma total de los números es "+ sumatorio);

        teclado.close();


    }

}
