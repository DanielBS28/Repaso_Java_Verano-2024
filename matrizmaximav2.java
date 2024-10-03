import java.util.Arrays;
import java.util.Random;

public class matrizmaximav2 {

    static Random r = new Random();
    
    

    static int [][] generarnumerosmatriz (int [][]m){

        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[i].length; j++) {
                m [i][j] = r.nextInt(9);
            }

            return m;
    }

    static int numerorandom (){
       int  n = r.nextInt(1,4);
        return n; 
    }

    static int[][] tamañomatriz (int m[][]){

         int [][] matriz = new int [numerorandom()][];

         for (int i = 0; i < matriz.length; i++) {
            matriz [i]= new int [numerorandom()];
         }

            return matriz;
            
    }

    static int columnasarraynuevo( int []a1, int indice){

        return a1[indice];
    }

  static int columnasarraymenor( int []a1, int []a2, int indice){

            if(a1[indice]<a2[indice])
            return a1[indice];
            else
            return a2[indice];
        }

        static int columnasarraymayor( int []a1, int []a2, int indice){

            if(a1[indice]>a2[indice])
            return a1[indice];
            else
            return a2[indice];
        }


    static void imprimirmatriz (int [][]m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

    }

    static int alturamatrizgrande (int [][]matriz1, int [][]matriz2){

        if(matriz1.length > matriz2.length)
        return matriz1.length;
        else
        return matriz2.length;
    }

    static int[] matrizgrande (int []c1, int []c2){

        if(c1.length > c2.length)
        return c1;
        else
        return c2;
    }

    static int alturamatrizpequeña (int [][]matriz1, int [][]matriz2){

        if(matriz1.length < matriz2.length)
        return matriz1.length;
        else
        return matriz2.length;
    }


    static int [] tamañofilasmatrices (int [][]matriz){

        int [] matriz1 = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) 
               matriz1 [i] = matriz[i].length;
            
        return matriz1;
    }



    static int [][] actualizarmatriz3pequeña (int [][]m1, int [][]m2, int [][]m3, int c1[], int []c2){

        c1 = tamañofilasmatrices(m1);
        c2 = tamañofilasmatrices(m2);
        int n = alturamatrizpequeña(m1, m2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < columnasarraymenor(c1, c2, i); j++) {
                if(m1[i][j]>m2[i][j])
                m3[i][j] = m1[i][j];
                else
                m3 [i][j]=m2[i][j];
            }
        }
        m3 = actualizarcolumnasmatrizgrande(m1, m2, m3, c1, c2);
        m3 = rellenarcolumnasrestantes(m1, m2, m3, c1, c2);
        return m3;
    }

    static int [][] actualizarcolumnasmatrizgrande(int [][]m1, int [][]m2, int [][]m3, int c1[], int []c2){

        int altura = alturamatrizpequeña(m1, m2); 
        for (int i = 0; i < altura; i++) {
            for (int j = columnasarraymenor(c1, c2, i); j < columnasarraymayor(c1, c2, i); j++) {
                if(m1[i].length> m2[i].length)
                m3[i][j] = m1[i][j];
                else 
                m3 [i][j]= m2[i][j];
            }
        }
        return m3;

        
    }

    static int [][] rellenarcolumnasrestantes (int [][]m1, int [][]m2, int [][]m3, int c1[], int []c2){

        int altura = alturamatrizgrande(m1, m2);
        int alturapequeña = alturamatrizpequeña(m1, m2);
        // int diferencia = altura - alturamatrizpequeña(m1, m2);
        for (int i = alturapequeña; i < altura; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                if (m1.length > m2.length)
                m3[i][j] = m1 [i][j];
                else
                m3[i][j] = m2 [i][j];
            }
        }

        return m3;
    }

    static int [][] rellenarcolumnasmatriz3 (int [][]m1, int [][]m2, int [][]m3, int c1[], int []c2){

        c1 = tamañofilasmatrices(m1);
        c2 = tamañofilasmatrices(m2);
        int n = alturamatrizpequeña(m1, m2);

        for (int i = 0; i < n ; i++) {
            
                m3[i]= new int [columnasarraymayor(c1, c2, i)];
            
        }
        m3 = rellenarcolumnasmatrizaumentada(m1, m2, m3, c1, c2);
        return m3;
    }

    static int [][] rellenarcolumnasmatrizaumentada (int [][]m1, int [][]m2, int [][]m3, int c1[], int []c2){
        int []c3 = matrizgrande(c1,c2);

        for (int i = alturamatrizpequeña(m1, m2) ; i < alturamatrizgrande(m1, m2); i++) {
            
                m3[i]= new int [columnasarraynuevo(c3, i)];
            
        }
        return m3;
    }
    public static void main(String[] args) {

        int [][] matriz1 = new int[0][0]; 
        int [][] matriz2 = new int[0][0];
        
        
        matriz1 = tamañomatriz(matriz1); // Genera el tamaño de la matriz con un número random (filas y columnas)
        matriz2 = tamañomatriz(matriz2);

        int matriz3 [][] = new int [alturamatrizgrande(matriz1, matriz2)][];

        int [] matrizcomparar1 = tamañofilasmatrices(matriz1); // Genera un array con la cantidad de datos de cada columna de la matriz
        int []matrizcomparar2 = tamañofilasmatrices(matriz2);

        // System.out.println(Arrays.toString(matrizcomparar1));
        imprimirmatriz(matriz1 = generarnumerosmatriz(matriz1));
        
        System.out.println();

        // System.out.println(Arrays.toString(matrizcomparar2));
        imprimirmatriz(matriz2 = generarnumerosmatriz(matriz2));

        System.out.println();

        matriz3 = rellenarcolumnasmatriz3(matriz1, matriz2, matriz3, matrizcomparar1, matrizcomparar2);
        
       // imprimirmatriz(matriz3);

        matriz3 = actualizarmatriz3pequeña(matriz1, matriz2, matriz3, matrizcomparar1, matrizcomparar2);

        imprimirmatriz(matriz3);


        


       // matrizmaxima(matriz1, matriz2);
        

    }
    
}
