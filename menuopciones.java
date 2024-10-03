public class menuopciones {

    static void menu(int opciones){
        
        for (int i = 1; i <= opciones; i++) {
            System.out.println(i + "- Opción " + i );
        }
        System.out.println(opciones +1 + "- SALIR");
    }

    public static void main(String[] args) {
        
        menu(5);
    }
    
}
