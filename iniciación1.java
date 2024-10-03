import java.util.Scanner;

public class iniciación1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numnuevo;
        int contadormayor = 1;
        int contadormenor = 1;
        int cantidad;
        int mayor;
        int menor;

        System.out.println("Dime una cantidad de números que introducirás después");
        cantidad = teclado.nextInt();

        System.out.println("Dime el primer número y lo compararemos con los siguientes");
        mayor = teclado.nextInt();
        menor = mayor;

        for (int i = 1; i <= cantidad - 1; i++) {

            System.out.println("Dime el numero " + (i + 1) + " de " + cantidad);
            numnuevo = teclado.nextInt();

            if (numnuevo > mayor) {
                mayor = numnuevo;
                contadormayor = 1;
            } else if (mayor == numnuevo)
                contadormayor++;

            if (numnuevo < menor) {
                menor = numnuevo;
                contadormenor = 1;
            } else if (menor == numnuevo)
                contadormenor++;

        }

        System.out.println("El número mayor es " + mayor + " y lo has introducido " + contadormayor + " "
                + (contadormayor == 1 ? "vez" : "veces"));
        System.out.println("El número menor es " + menor + " y lo has introducido " + contadormenor + " "
                + (contadormenor == 1 ? "vez" : "veces"));

            teclado.close();

    }
}