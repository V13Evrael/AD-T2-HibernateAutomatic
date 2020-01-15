package es.studium.ClasePoJo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Generated 8 ene. 2020 14:17:41 by Hibernate Tools 5.4.7.Final

/**
 * Perros generated by hbm2java
 */

public class Perros implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idPerro;
	
	private String razaPerro;
	
	private String tamanoPerro;
	
	private int edadPerro;
	
	private String colorPerro;

	public Perros() {
	}

	public Perros(int idPerro, String razaPerro, String tamanoPerro, int edadPerro, String colorPerro) {
		this.idPerro = idPerro;
		this.razaPerro = razaPerro;
		this.tamanoPerro = tamanoPerro;
		this.edadPerro = edadPerro;
		this.colorPerro = colorPerro;
	}

	public int getIdPerro() {
		return this.idPerro;
	}

	public void setIdPerro(int idPerro) {
		this.idPerro = idPerro;
	}

	public String getRazaPerro() {
		return this.razaPerro;
	}

	public void setRazaPerro(String razaPerro) {
		this.razaPerro = razaPerro;
	}

	public String getTamanoPerro() {
		return this.tamanoPerro;
	}

	public void setTamanoPerro(String tamanoPerro) {
		this.tamanoPerro = tamanoPerro;
	}

	public int getEdadPerro() {
		return this.edadPerro;
	}

	public void setEdadPerro(int edadPerro) {
		this.edadPerro = edadPerro;
	}

	public String getColorPerro() {
		return this.colorPerro;
	}

	public void setColorPerro(String colorPerro) {
		this.colorPerro = colorPerro;
	}

}
