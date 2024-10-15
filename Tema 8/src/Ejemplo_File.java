import java.io.*;

public class Ejemplo_File {

	public static void main(String[] args) {
		
		File fichero = new File("fichero.txt");
		
	
			try {
				if(fichero.createNewFile())
					System.out.println("Se ha creado el fichero");
				else
					System.out.println("Ya existe");
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		System.out.println(fichero.getAbsolutePath());

	}

}
