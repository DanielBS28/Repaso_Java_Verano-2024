import java.util.Scanner;

public class triangulorecursivo {

    static void pintartriangulo(int fila, int columna, int altura){

        if(columna < fila){
        System.out.print("*");
        pintartriangulo(fila, columna + 1, altura);
        }else {
            System.out.println(" ");
            if (fila < altura) 
                pintartriangulo(fila + 1, columna = 0, altura);
        }

    }

    static void triangulo(int altura){

        int fila = 0, columna =0;
        pintartriangulo(fila + 1, columna, altura);
    } 
    
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la altura del triángulo");
        int altura = teclado.nextInt();
        triangulo(altura);

        teclado.close();
    }
}
