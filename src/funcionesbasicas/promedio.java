package funcionesbasicas;


import java.util.Scanner; 

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in); // ingresar datos de teclado 
		
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int promedio; 
		
		
		System.out.println("numero1");
		numero1 = entrada.nextInt();
		
		System.out.println("numero2");
		numero2 = entrada.nextInt();
		
		System.out.println("numero3");
		numero3 = entrada.nextInt();
		
		System.out.println("numero4");
		numero4 = entrada.nextInt();
		
		System.out.println("numero5");
		numero5 = entrada.nextInt();
		
		promedio = (numero1 + numero2 + numero3 + numero4 + numero5) / 5 ; 
		
		System.out.println("el promedio de los numeros es" + " " + promedio );
		
		

	}

}
