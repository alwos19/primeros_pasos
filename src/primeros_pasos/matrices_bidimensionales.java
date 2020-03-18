package primeros_pasos;
import javax.swing.*;
public class matrices_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [][] matrix={
			{3,4,6,7,8},
			{13,14,16,17,14},
			{24,21,25,27,26},
			{32,34,36,35,38}
			
	};
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z+ " ");
			}
		}
		
		

	}

}




/*matrix[0][0]=15;
matrix[0][1]=16;
matrix[0][2]=17;
matrix[0][3]=18;
matrix[0][4]=19;

matrix[1][0]=20;
matrix[1][1]=21;
matrix[1][2]=22;
matrix[1][3]=23;
matrix[1][4]=24;

matrix[2][0]=25;
matrix[2][1]=26;
matrix[2][2]=27;
matrix[2][3]=28;
matrix[2][4]=29;

matrix[3][0]=30;
matrix[3][1]=31;
matrix[3][2]=32;
matrix[3][3]=33;
matrix[3][4]=34;

for (int i=0;i<4;i++){
			System.out.println();
			
			for(int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+ " ");
				
			}
			
			
		}
		*/