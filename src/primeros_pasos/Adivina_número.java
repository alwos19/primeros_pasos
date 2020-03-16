package primeros_pasos;
import java.util.*;
public class Adivina_número {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un número, por favor");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("más bajo");
			}
			else if (aleatorio>numero) {
				System.out.println("Más alto");
			}
		} 
		
		System.out.println("El número es correcto y lo has conseguido en "+ intentos+" intentos" );
	}

}
