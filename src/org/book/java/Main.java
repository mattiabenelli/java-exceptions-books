package org.book.java;

import java.util.Arrays;
import java.util.Scanner;

import org.book.java.obj.Libro;

public class Main {
	
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
			
			arrLibri[i] = new Libro(titolo, numpagine, autore, editore);
			System.out.println("libro inserito correttamente");
			System.out.println("\n----------------------------------------\n");
//			System.out.println(arrLibri[i]);
			
		}
		
		in.close();
		System.out.println(Arrays.asList(arrLibri));
	}

}
