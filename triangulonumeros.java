import java.util.Scanner;

public class triangulonumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la altura del triángulo");

        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {

            int numero = 0;
            boolean maximo = true;

            for (int z = 0; z < altura - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                if (j >= i)
                    maximo = false;

                if (maximo) 
                    numero++;
                else 
                    numero--;
                    
                System.out.print(numero);
                    
            }
            System.out.println();
        }
        
    }

}
