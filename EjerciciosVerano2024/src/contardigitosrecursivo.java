import java.util.Scanner;

public class contardigitosrecursivo {

    static int numeroreal;
    static int contador = 0;

    static void imprimir(int contador, int numeroreal){
        System.out.println("El "+numeroreal +" tiene " + contador + " digito" + ((contador != 1) ? "s" : ""));
    }

    static void contardigitos (int numero){

        if(numero != 0){
            numero /= 10;
            contador++;
            contardigitos(numero);
        }else
        imprimir(contador, numeroreal);
    }

    static int digitos2(int n){
        if (n==0) return 0;
        else return 1+digitos2(n/10);
    }

    static void pintar(int n){
        System.out.println("El "+numeroreal +" tiene " + digitos2(n) + " digito" + ((contador != 1) ? "s" : ""));

    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré cuantos digitos tiene");
        numeroreal = teclado.nextInt();

        // contardigitos(numeroreal);
        pintar(numeroreal);

        teclado.close();

    }
    
}
