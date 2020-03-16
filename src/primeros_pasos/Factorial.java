package primeros_pasos;
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		int i=numero;
		
		while (i>0) {
			resultado=resultado*i;
			i--;
		}
			System.out.println("El factorial de "+ numero + " es: "+ resultado);
			
		}
		


	}


