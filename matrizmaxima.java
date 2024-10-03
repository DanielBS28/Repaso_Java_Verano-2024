import java.util.Random;

public class matrizmaxima {

    static Random r = new Random();

    static int [][] generarmatriz (int [][]m){

        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[i].length; j++) {
                m [i][j] = r.nextInt(9);
            }

            return m;
            
    }

    static int[][] tamañomatriz (int m[][]){

        int n = r.nextInt(1,4);

         int [][] matriz = new int [n][n];

            return matriz;
            
    }
    static void imprimirmatriz (int [][]m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

    }

    static boolean comprobarmatriz (int [][]matriz1, int [][]matriz2){

        if(matriz1.length == matriz2.length){
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    if(matriz1[i].length != matriz2[i].length)
                    return false;
                }
            }
            return true;
        } 

        return false;
    }

    static void matrizmaxima (int [][]matriz1, int [][]matriz2){


        if (comprobarmatriz(matriz1, matriz2)) {
            int [][]matrizmaxima = new int[matriz1.length][];
            for (int i = 0; i < matrizmaxima.length; i++) {
                matrizmaxima[i] = new int[matriz1[i].length];
            }
        for (int i = 0; i< matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] > matriz2[i][j])
                matrizmaxima[i][j] = matriz1 [i][j];
                else
                matrizmaxima[i][j] = matriz2[i][j];
            }
        }
        imprimirmatriz(matrizmaxima);
        }
        else
        System.out.println("Las matrices no se pueden comparar");
        
    }
    
    public static void main(String[] args) {

        int [][] matriz1 = new int [0][0]; 
        matriz1 = tamañomatriz(matriz1);
        int [][] matriz2= new int [0][0]; 
        matriz2 = tamañomatriz(matriz2);
 
        imprimirmatriz(matriz1 = generarmatriz(matriz1));
        System.out.println();
        imprimirmatriz(matriz2 = generarmatriz(matriz2));
        System.out.println();
        matrizmaxima(matriz1, matriz2);
        

    }
    
}
