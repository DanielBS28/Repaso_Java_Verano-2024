import java.util.Scanner;

public class strings3 {
    
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        int palabras = 1;
        System.out.println("Dime una frase y te diré cuantas palabras tiene");
        String frase = teclado.nextLine();
        frase = frase.trim();

        for(int i = 0; i<frase.length()-1; i++){
            if (frase.charAt(i) == ' ' && frase.charAt(i + 1)!= ' ')
            palabras++;
        }
        if (frase.equals(""))
        System.out.println("Tu frase no tiene palabras");
        else
        System.out.println("Tu frase tiene " + palabras + " palabra" +(palabras > 1 ? "s": ""));

        teclado.close();
    }
}
