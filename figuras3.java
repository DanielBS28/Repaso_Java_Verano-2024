import java.util.Scanner;

public class figuras3 {
    public static void main(String[] args) {
        
    
    System.out.println("Vamos a dibujar una pirámide de asteriscos, dime la altura:");
    Scanner teclado = new Scanner (System.in);

    int altura = teclado.nextInt();

    System.out.println("PIRÁMIDE");

    for (int i = 1; i<=altura ; i++){
        for (int j = 1; j<=altura -i; j++) {
            System.out.print(" ");
        }
        for (int z = 1; z<= 2*i -1; z++) {
            System.out.print("*");
        }

        System.out.println();
    }

    System.out.println("PIRÁMIDE SIN RELLENO");

    for (int i = 1; i<=altura ; i++){

        for (int z = 1; z<= altura * 2 - 1; z++) {
            if(i == altura || z == altura -i +1 || z == altura + i - 1)
            System.out.print("*");
            else
            System.out.print(" ");

        }

        System.out.println();
    }

    System.out.println("PIRÁMIDE INVERSA");

    for (int i = 1; i<=altura ; i++){
        for (int j = 1; j <= i - 1; j++) {
            System.out.print(" ");
        }
        for (int z = 1; z<=(altura * 2 + 1)-(i*2); z++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("PIRÁMIDE INVERSA SIN RELLENO");
        
        for (int i = 1; i<=altura ; i++){
            for (int j = 1; j <= altura * 2 - 1; j++) {
                if (i == 1 || i  == j || j == (altura*2) - i) 
                System.out.print("*");
                else
                System.out.print(" ");
        }

        System.out.println();
    }

    System.out.println("PIRÁMIDE EJERCICIO PROPUESTO");

    for (int i = 1; i<=altura ; i++){
        for (int j = 1; j<=altura -i; j++) {
            System.out.print(" ");
        }
        for (int z = 1; z<= 2*i -1; z++) {

            if(z % 2 !=0)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    teclado.close();
}
}



