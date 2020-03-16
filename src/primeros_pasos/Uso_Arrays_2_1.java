package primeros_pasos;
import javax.swing.*;

public class Uso_Arrays_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String [] paises=new String[8];
		
		for (int i = 0; i < 8; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país "+ (i+1) );
			
		}
		
		for(String elemento:paises) {
			System.out.println("País: "+ elemento);
		}
	}

}
