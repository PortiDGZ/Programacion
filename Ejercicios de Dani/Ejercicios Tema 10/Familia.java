package Ejercicios;

import java.util.*;

public class Familia {
	
	// Atributos
	private Familiar padre;
	private Familiar madre;
	private ArrayList<Familiar> hijos = new ArrayList<Familiar>();
	
	// Constructores
	public Familia(Familiar padre, Familiar madre) {
		super();
		this.padre = padre;
		this.madre = madre;
	}
	
	// Añade un hijo (max 10)
	public void addHijo(Familiar hijo) {
		if (hijos.size() <= 10) {
			hijos.add(hijo);
		} else {
			System.out.println("Demasiados hijos.");
		}
	}	
	
	//Getters
	public Familiar getPadre() {
		return padre;
	}

	public Familiar getMadre() {
		return madre;
	}

	public ArrayList<Familiar> getHijos() {
		return hijos;
	}

}
