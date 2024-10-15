

public class binariasrecursividad {

    static boolean binario(int n) {

        if (n >=0 && n <10) {
            if (n == 0 || n == 1) return true;
            return false;
        }
        if (n % 10 == 0 || n% 10 == 1) return binario(n/10);
        return false;
            
        
    }
    public static void main(String[] args) {
        System.out.println(binario(1015010));
    }

}
