public class ejerciciodiagonalmatriz {

    static char[][] crearmatriz(int n) {
        char[][] matriz = new char[n][n];

        return matriz;
    }

    static int[][] crearmatriz2(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        return matriz;

    }

    static int[][] crearmatriz3(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - i - 1)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;

            }
        return matriz;
    }

    static void imprimirmatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i)
                    matriz[i][j] = 'X';
                else
                    matriz[i][j] = '-';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    static void matrizinversa(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - i - 1)
                    matriz[i][j] = 'X';
                else
                    matriz[i][j] = '-';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }

    static void fematriz2(int[][] matriz) {

        for (int[] n : matriz){
            for (int j : n) {
                if (j == 1)
                System.out.print("X");
                else
                System.out.print("-");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        char[][] matriz = crearmatriz(4);
        int[][] matriz2 = crearmatriz2(4);
        int[][] matriz3 = crearmatriz3(4);
        imprimirmatriz(matriz);
        System.out.println();
        matrizinversa(matriz);
        System.out.println();
        fematriz2(matriz2);
        System.out.println();
        fematriz2(matriz3);

    }

}
