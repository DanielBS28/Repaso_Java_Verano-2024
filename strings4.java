import java.util.Scanner;

public class strings4 {

    // Palindromo
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    String aux = "";

    System.out.println("Dime una palabra y te diré si es palíndromo o no");
    String palabra = teclado.nextLine().toLowerCase();

    for (int i = palabra.length() - 1; i>=0; i--){
        aux += palabra.charAt(i);
    }

    if (aux.equals(palabra)) 
        System.out.println("Es un palindromo");
        else 
        System.out.println("No es un palindromo");

        System.out.println(aux + " " + palabra);
    
    teclado.close();

        
    }
    
}
