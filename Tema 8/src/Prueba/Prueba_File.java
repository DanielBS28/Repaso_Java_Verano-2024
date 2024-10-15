package Prueba;

import java.io.File;
import java.io.IOException;

public class Prueba_File {

	public static void main(String[] args) {
		
		String nombreFichero = "ficheroPrueba.txt";
		
		File fichero = new File("src/Hola.txt");
		File carpeta = new File("Hola/Carpeta");
		
		// Mkdir no me permite crear la carpeta si el directorio superior no existe
		//Mkdirs en caso de no existir la carpeta padre me la crea también
		/*
		 * if(carpeta.mkdir())
			System.out.println("Se ha creado");
		else 
			System.out.println("Error");
		*/
		System.out.println(carpeta.mkdirs() ? "Se ha creado" : "Error");
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
