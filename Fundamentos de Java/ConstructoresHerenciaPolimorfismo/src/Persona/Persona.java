package Persona;


 
       public class Persona {
		private String nombre;
		private String apellido;
		private int edad;
		
		public Persona(){
			System.out.println("Persona()");
		}
		public Persona(String nombre) {
			System.out.println("Persona(String nombre)");
			this.nombre = nombre;	
		}
		public Persona(String nombre, String apellido, int edad) {
		
		    this.nombre = nombre;
			this.apellido = apellido;

			this.edad = edad;
		}			
		
		
		public String getnombre() {
			return nombre;
	    }		
		public void setnombre(String nombre) {
			this.nombre=nombre;
    	}
		public String getapellido() {
			return apellido;
	    }
		
     	public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	
		
     	public int getedad() {
   			return edad;
   		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
   		
 }
	