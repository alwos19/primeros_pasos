package primeros_pasos;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int [] mi_matriz=new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71; */
		
		int [] mi_matriz={5, 38, -15, 92, 71, 6, 89, 50, 34, 57, 87, 37,90,101,73};
		
	for (int i = 0; i < mi_matriz.length; i++) {
		
		System.out.println("posición: "+ i + " valor: "+mi_matriz[i]);
		
	}
		
	}

}
