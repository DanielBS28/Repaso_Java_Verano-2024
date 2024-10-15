public class ejercicio1 {
    
    public static void main(String[] args) {

        int L = 3;
        
        for (int filaCuad=0; filaCuad < L; filaCuad++)
        for (int fila=0; fila < L; fila++ ){
            for (int colCuad=0; colCuad < L; colCuad ++)
            for(int col=0; col < L; col++)
                    if ((filaCuad + colCuad) % 2 == 0)
                        System.out.print("*");
                    else
                    System.out.print("-");
            System.out.println();
        }


}


    }

