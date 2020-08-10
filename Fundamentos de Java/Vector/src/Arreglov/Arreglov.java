package Arreglov;
import java.util.Scanner;
import java.util.Vector;


public class Arreglov {
	
	public static void ingresarDatos(int edad[], int LIMITE) {
			Scanner entrada = new Scanner(System.in);
			int e;
		    
			
		for (int indice =0; indice < edad.length; indice++)
		{   
			System.out.print("INGRESE EDAD EN LA CASILLA " +indice+ ": ");
			e= entrada.nextInt();
			edad[indice]= e;
			
		}
		
	}
	
	public static void mostrarDatos(int edad[], int LIMITE)	{
		System.out.println("MOSTRAR LOS DATOS DEL Vector...");
		for (int posicion = 0;posicion < LIMITE; posicion++)
			System.out.print(edad[posicion] + " ");
			}
	
			
	public static void main(String[] args) {
		final int LIMITE = 5;
		
		int [] edad = new int [LIMITE];
		
		
	ingresarDatos(edad,LIMITE);
	mostrarDatos(edad,LIMITE);
	}

}
