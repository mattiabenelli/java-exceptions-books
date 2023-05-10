package org.book.java.obj;

public class Libro {
	
	private String titolo;
	private int numpagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numpagine, String autore, String editore) {
		
		setTitolo(titolo);
		setNumpagine(numpagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public int getNumpagine() {
		return numpagine;
	}
	
	public void setNumpagine(int nPagine) {
		this.numpagine = nPagine;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getEditore() {
		return editore;
	}
	
	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	@Override
	public String toString() {

		return "titolo: " + getTitolo() +
				"\nnumero di pagine: " + getNumpagine() +
				"\nautore del libro: " + getAutore() +
				"\neditore del libro: " + getEditore();
	}
	
	
}
