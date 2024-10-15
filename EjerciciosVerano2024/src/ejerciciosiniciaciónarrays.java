import java.util.Random;
import java.util.Scanner;

public class ejerciciosiniciaciónarrays {

    static Scanner teclado = new Scanner(System.in);

    static void contarnumeroarray(int[] array, int n) {

        int contador = 0;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] = r.nextInt(30)) + "-");
            if (array[i] == n)
                contador++;

        }
        System.out.println(array[array.length - 1] = r.nextInt(30));
        if (array[array.length - 1] == n)
            contador++;

        System.out.println("El numero " + n + " ha salido " + contador + " vez" + (contador != 1 ? "\bces" : ""));

    }

    static void stringmaslargo(String[] array) {

        String max = array[0] = "";

        for (int i = 0; i < array.length; i++) {

            System.out.println("Dime la frase " + (i + 1) + " de " + array.length);
            array[i] = teclado.nextLine();

        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].length() > max.length())
                max = array[i];
        }
        if (max == "")
            System.out.println("Tu frase no tiene palabras");
        else
            System.out.println("La frase mas larga es: " + max);

    }

    static void stringletrarepetida(String[] array, char letra) {

        String frase = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime la frase " + (i + 1) + " de " + array.length);
            array[i] = teclado.nextLine();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] != "") {
                if (array[i].charAt(0) == letra)
                    frase += array[i] + ", ";
            }
        }

        if (frase == "")
            System.out.println("No hay ninguna frase en tu array que empieze por la letra " + letra);
        else
            System.out.println(frase + "\b\b  ");

    }

    static int[] comparararrays(int[] array1, int[] array2) {

        int max;

        if (array1.length <= array2.length)
            max = array1.length;
        else
            max = array2.length;

        int[] arraycorrecto = new int[max];

        for (int i = 0; i < max; i++) {
            if (array1[i] >= array2[i])
                arraycorrecto[i] = array1[i];
            else
                arraycorrecto[i] = array2[i];
        }
        return arraycorrecto;
    }

    static void mostrararray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);

    }

    static int[] llenararray(int[] array) {

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        return array;
    }

    public static void main(String[] args) {

        Random r = new Random();

        int[] array = new int[10];
        contarnumeroarray(array, 15);


        String[] arrayStrings2 = new String[5];
        // stringmaslargo(arrayStrings2);

        
        String[] arrayStrings3 = new String[5];
        // stringletrarepetida(arrayStrings3, 'a');


        int[] arraycomparar1 = new int[r.nextInt(15)];
        int[] arraycomparar2 = new int[r.nextInt(15)];
        int[] arraycorrecto;
        arraycorrecto = comparararrays(llenararray(arraycomparar1), llenararray(arraycomparar2));
        mostrararray(arraycorrecto);
        System.out.println();
        mostrararray(arraycomparar1);
        System.out.println();
        mostrararray(arraycomparar2);
    }

}
