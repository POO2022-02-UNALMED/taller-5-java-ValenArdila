package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre; 
	private String ubicacion; 
	private static ArrayList<Zona> zonas = new ArrayList<Zona>(); 
	
	
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zonas) {
		Zoologico.zonas.add(zonas);
		
	}
	
	public int cantidadTotalAnimales() {
		int suma=0;
		for (int i=0;i<zonas.size();i++) {
			suma += zonas.get(i).cantidadAnimales();
		}
		return suma; 
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static ArrayList<Zona> getZonas() {
		return zonas;
	}

	public static void setZonas(Zona zonas) {
		Zoologico.zonas.add(zonas); 
	}

	
	
	

}
