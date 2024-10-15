public class numeroalreves {

    static void reves (int numero){

        if(numero>= 0 && numero < 10) 
        System.out.print(numero);
        else{
        System.out.print(numero%10);
        reves(numero/10);
        }
    }

    static int alreves(int num, int numinver){

        if(num > 0){
            return alreves(num/10, num%10 + numinver*10);
        }
        return numinver;

    }

    public static void main(String[] args) {
        
    reves(796);

    System.out.println("\n"+ alreves(5678, 0));
    }
    
}
