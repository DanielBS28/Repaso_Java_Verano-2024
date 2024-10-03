public class conversorbinario {

    static int binario (int n){

        if (n == 0 || n == 1)
        return n;
        
        return n%2 + 10*binario(n/2);
    }
    public static void main(String[] args) {
        
        System.out.println(binario(192));
    }
    
}
