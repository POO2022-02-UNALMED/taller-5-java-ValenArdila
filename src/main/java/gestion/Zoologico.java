package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre; 
	private String ubicacion; 
	private ArrayList<Zona> zonas = new ArrayList<Zona>(); 
	
	
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
		
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

	public ArrayList<Zona> getZona() {//getZonas
		return zonas;
	}

	public void setZonas(Zona zonas) {
		this.zonas.add(zonas); 
	}
	
	
	

}