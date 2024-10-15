import java.util.Scanner;

public class strings2 {
    
    public static void main(String[] args) {
        
        String dos = "";
        String Aux = "";

        Scanner teclado = new Scanner(System.in);

        // Ejercicio que pide 5 strings y te diga cual es el mas largo en cuanto a caracteres

        System.out.println("Dime una palabra");
            Aux = teclado.nextLine();

        for (int i = 1; i<5; i++){
            System.out.println("Dime la palabra " + (i+1)+ " de 5 " );
            dos = teclado.nextLine();
            if (Aux.length()<dos.length()){
                Aux = dos; 
            }

        }

        System.out.println("La palabra mas grande es " + Aux);

        teclado.close();
    }
}
