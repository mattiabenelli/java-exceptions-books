package org.book.java;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

import org.book.java.obj.Libro;

public class Main {
	
	private static final String FILENAME = "C:\\Users\\pasca\\Desktop\\libri_java.txt";
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		System.out.println("Inserisci il numero di libri da aggiungere: ");
		int arrLibriLng = in.nextInt();
		
		Libro[] arrLibri = new Libro[arrLibriLng];
		
		for(int i = 0; i < arrLibriLng; i++) {
			
			System.out.println("Inserisci il titolo del libro: ");
			String titolo = in.next();
			
			System.out.println("Inserisci il numero di pagine del libro: ");
			int numpagine = in.nextInt();
			
			System.out.println("Inserisci l'autore del libro: ");
			String autore = in.next();
			
			System.out.println("Inserisci l'editore del libro: ");
			String editore = in.next();
			
			try {
				
				FileWriter myWriter = new FileWriter(FILENAME);
				
				arrLibri[i] = new Libro(titolo, numpagine, autore, editore);
				
				System.out.println("\nlibro inserito correttamente");
				System.out.println("\n----------------------------------------\n");
				
				myWriter.close();
				
				
			} catch(Exception e) {
				
				System.err.println("Errore nella creazione di Libro\n" + e.getMessage());
				
			}
			
		}
		
		try {
			
			FileWriter myWriter = new FileWriter(FILENAME);
			
			for(int x = 0; x < arrLibriLng; x++) {
				
				myWriter.write(arrLibri[x].toString() + "\n");
			}
			
			myWriter.close();
			
			
		} catch(Exception e) {
			
			System.err.println("Errore nella scrittura di Libro\n" + e.getMessage());
			
		}
//		System.out.println(arrLibri[i]);
		
		try {
			
			File mioFile = new File(FILENAME);
			Scanner reader = new Scanner(mioFile);
			
			while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        System.out.println(data);
		      }
			
			
		} catch (Exception e) {
			
			System.err.println("Errore nella lettura di Libro\n" + e.getMessage());
		}
		
		in.close();
//		System.out.println(Arrays.asList(arrLibri) + "\n");

		
		
		
	}
	
	

}
