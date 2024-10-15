import java.util.Arrays;

public class arraysforeach {
    
    public static void main(String[] args) {
        
        int [] array = {1,2,3};
        int [][] array2 = {{1,2,3},{2,3,5},{6,3,6}};

        for (int n : array){
            System.out.print(n+ " ");
    
        }

        for (int [] n : array2)
        for (int columna : n)
        System.out.print(columna+ " ");

        for(int []n : array2)
        System.out.println(Arrays.toString(n));

        System.out.println(Arrays.toString(array));
    }
    
}
