package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;

public class Principal {
	public static void main(String[]args) {
		Zoologico z1= new Zoologico("Vial","San Francisco");
		Zoologico z2= new Zoologico();
		Zona zona2 =new Zona("ciudad",z2);
		Zona zona1= new Zona("selva",z1);
		
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		System.out.println(Animal.totalPorTipo());
		
	
		
	}

}
