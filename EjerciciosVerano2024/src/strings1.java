import java.util.Scanner;

public class strings1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String palabra = "";

        System.out.println("Dime una palabra y le pondré espacios entre las letras");
        palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i) + " ");
        }

        teclado.close();
    }
}
