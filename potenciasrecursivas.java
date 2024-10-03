public class potenciasrecursivas {

    static int potencia (int base, int exponente){

        if (exponente == 0) return 1;
        return base*potencia(base, exponente-1);

    }

    public static void main(String[] args) {
        int base = 5,  exponente = 3;
        
        System.out.println("El número "+base+" elevado a "+exponente+ " = " + potencia(base, exponente));
    }
    
}
