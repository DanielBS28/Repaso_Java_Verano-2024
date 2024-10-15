import java.util.Scanner;

public class figuras1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int base, altura;

        System.out.println("Dime la altura del rectángulo");
        altura = teclado.nextInt();

        System.out.println("Dime la base del rectángulo");
        base = teclado.nextInt();

        System.out.println("RECTÁNGULO COMPLETO");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("RECTÁNGULO CON BORDES");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i == altura - 1 || j == 0 || j == base -1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }


        teclado.close();
    }
}
