package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private  String nombre; 
	private  static ArrayList<Zoologico> zoo= new ArrayList<Zoologico>();
	private  static ArrayList<Animal> animales= new ArrayList<Animal>();
	

	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		Zona.zoo.add(zoo);
		Zoologico.setZonas(this);
	}

	public Zona() {
		Zoologico.setZonas(this);
		
	}
	
	public void agregarAnimales(Animal animales) {
		Zona.animales.add(animales); 
		
	}
	
	public int cantidadAnimales() {
		return Zona.animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	public static void setZoo(Zoologico zoo) {
		Zona.zoo.add(zoo);
	}

	public static ArrayList<Animal> getAnimales() {
		return animales;
	}

	public static void setAnimales(Animal animales) {
		Zona.animales.add(animales);
	}

	
	

	
	
	
	

}
