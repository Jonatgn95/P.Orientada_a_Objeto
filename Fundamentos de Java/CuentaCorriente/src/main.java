import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	CuentaCorriente cta1 = new CuentaCorriente();
	CuentaCorriente cta2 = new CuentaCorriente();
	
	Scanner in = new Scanner(System.in);
	System.out.println("Ingrese cantidad a deposito para cta1 ");
	double dinero = in.nextDouble();
	cta1.depositar(dinero);
	
	System.out.println("Ingrese cantidad a deposito para cta2 ");
    dinero = in.nextDouble();
	cta2.depositar(dinero);
	
	System.out.println("Saldo Cta1: "+ cta1.getSaldo());
	System.out.println("Saldo Cta2: "+ cta2.getSaldo());
	
	
	
	 
	
	
	}

	}

	
	