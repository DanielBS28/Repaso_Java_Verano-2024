import java.util.Scanner;

public class figuras2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int altura;

        System.out.println("Dime la altura del triángulo rectángulo");
        altura = teclado.nextInt();

        System.out.println("TRIÁNGULO RECTÁNGULO COMPLETO");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(i >= j)
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("TRIÁNGULO RECTÁNGULO CON BORDES");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j == 0|| j == i || i == altura -1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("TRIÁNGULO RECTÁNGULO INVERTIDO");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j >= altura - i  -1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("TRIÁNGULO RECTÁNGULO INVERTIDO CON BORDES");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j == altura -1 || i == altura -1 || i + j == altura -1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        teclado.close();
    }
    
}
