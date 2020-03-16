package primeros_pasos;

import java.util.*;

public class entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Su nombre es: "+ nombre_usuario + " y su edad en un año sera de "+ (edad+1));
		

	}

}
