package org.book.java.obj;

public class Libro {
	
	private String titolo;
	private int numpagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numpagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setNumpagine(numpagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) throws Exception {
		
		if(titolo.length() == 0) {
			
			throw new Exception("Il titolo non può essere vuoto");
		}
		
		this.titolo = titolo;
	}
	
	public int getNumpagine() {
		return numpagine;
	}
	
	public void setNumpagine(int numpagine) throws Exception {
		
		if (numpagine <= 0) {
			
			throw new Exception("Il numero di pagine non può essere minore o pari a zero");
		}
		
		this.numpagine = numpagine;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) throws Exception {
		
		if(autore.length() == 0) {
			
			throw new Exception("L'autore non può essere vuoto");
		}
		
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
				"\neditore del libro: " + getEditore() + "\n";
	}
	
	
}
