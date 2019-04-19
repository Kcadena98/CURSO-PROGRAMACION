package funcionesbasicas;

import java.util.Scanner;

public class MAXIMODERESNUMEROS {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); // esta opcion es util para leer los datos que ordenamos del teclado
		
		int numero1, numero2, numero3; // variables para almacenar los datos
		
		
		System.out.println("ingrese el numero");
		numero1 = entrada.nextInt(); 
		
		System.out.println("ingrese el numero");
		numero2 = entrada.nextInt(); 
		
		
		System.out.println("ingrese el numero");
		numero3 = entrada.nextInt(); 
		
		if(numero1 > numero2) // si el numero 1 es mayor a numero 2
			if (numero1 > numero3) // si el numero 1 es no es mayor al numero 3 
				System.out.println("el mayor es" + numero1); // imprima que el mayor es el numero 1
			else  // si no es mayor al numero 3 
				System.out.println("el mayor es " + numero3); // imprima que el mayor sea el numero 3
		
		else if (numero2 > numero3) // en caso de que sea falso se pregunta una condicion 
			System.out.println("el mayor es " + numero2);
		else 
			System.out.println("el mayor es " + numero3);
		
			
		
		
		// TODO Auto-generated method stub

	}

}
