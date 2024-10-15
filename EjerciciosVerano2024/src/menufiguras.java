import java.util.Scanner;

public class menufiguras {

    static Scanner teclado = new Scanner(System.in);
    static boolean salir = true;

    static void menu() {
        System.out.println("SELECCIONA UNA OPCIÓN DEL MENÚ\n");
        System.out.println("1- Dibujar rectángulo");
        System.out.println("2- Dibujar rectángulo sin relleno");
        System.out.println("3- Dibujar triángulo");
        System.out.println("4- Dibujar triángulo sin relleno");
        System.out.println("5- Salir");
    }

    static void rectangulo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rectangulosinrelleno(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void triangulo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangulosinrelleno(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == i || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void opciones(int n, int altura) {
        if (n == 1)
            rectangulo(altura);
        else if (n == 2)
            rectangulosinrelleno(altura);
        else if (n == 3)
            triangulo(altura);
        else if (n == 4)
            triangulosinrelleno(altura);
        else
            salir = salir();

    }

    static boolean salir() {
        return salir == false;
    }

    public static void main(String[] args) {

        System.out.println("Dime la altura de la figura");
        int altura = teclado.nextInt();
        int opcion;
        boolean rango = true;

        do {
            menu();
            do {
                opcion = teclado.nextInt();
                if (opcion >= 1 && opcion <= 5)
                    opciones(opcion, altura);
                else
                    System.out.println("\nHas introducido un número que no está en el rango del 1 al 5");
                rango = false;

            } while (rango);

        } while (salir);

    }

}
