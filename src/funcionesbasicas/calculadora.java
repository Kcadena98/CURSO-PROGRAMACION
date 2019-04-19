
package funcionesbasicas;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner tec = new Scanner (System.in);
		
		
		int numero1, numero2, opcion;
		System.out.println("Ingrese Numero1: ");
		numero1= tec.nextInt();
		System.out.println("Ingrese Numero2: ");
		numero2= tec.nextInt();
		
		do {
				System.out.println("1.- Sumar.  "); 
				System.out.println("2.- Restar.  ");
				System.out.println("3.- Multiplicar.");
				System.out.println("4.- Dividir.");
				System.out.println("5.- salir.");
				System.out.println("\n Ingrese una opcion: "); 

		opcion = tec.nextInt(); 
		} while (opcion < 1 || opcion > 5 ); 
		switch (opcion) {
		
		case 1: 
			System.out.println(numero1 + numero2);
			break;
		case 2: 
			System.out.println(numero1 - numero2);
			break;
		case 3:
			System.out.println(numero1 * numero2);
			break;
		case 4: 
			System.out.println(numero1 / numero2);
			break;
		case 5:
			System.exit(0);
			break;
			
		
			default: System.out.println("caso no encontrado"); 
			
		}
		
	}


}
