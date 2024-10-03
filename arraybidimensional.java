public class arraybidimensional {

    public static void main(String[] args) {
        
        // int [][] arraybidimensional = new int[3][3];
        int [][] arraybidimensional = {{1,2,3},{1,2,3},{1,2,3}};

        for (int i = 0; i < arraybidimensional.length; i++) {
            for (int j = 0; j < arraybidimensional[i].length; j++) {
             System.out.print(arraybidimensional[i][j]);   
            }
            System.out.println();
        }

    }
    
}
