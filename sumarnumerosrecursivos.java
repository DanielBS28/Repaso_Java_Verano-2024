public class sumarnumerosrecursivos {

    static void sumanumeros(int n, int total) {

        if (n == 1)
            System.out.print(n + "=" + (total + 1));

        else {
            System.out.print(n + "+");
            total += n;
            sumanumeros(n - 1, total);
        }

    }

    static void sumadecreciente(int n) {
        sumanumeros(n, 0);
    }

    static void sumaCreciente(int n) {
        sumaCrecientemostrar(1,n,0);
    }

    static void sumaCrecientemostrar(int contador, int n, int total){

        if (contador <n){
            System.out.print(contador + "+");
            total+=contador;
            sumaCrecientemostrar(++contador,n,total);
        }
        else{
            System.out.print(n + "=" + (total+n));
        }
    }

    public static void main(String[] args) {

        sumadecreciente(5);
        System.out.println();
        sumaCreciente(5);

    }



}
