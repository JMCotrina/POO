	public class Ejercicio_1 {
		
		public static int dato (int fila, int columna) {
			if(fila<1||columna<1) {return 0;}
			if(fila==1||columna==1) {return 1;}
		return dato(fila-1, columna)+dato (fila,columna-1);
	}
	public static void cuadrado (int dimension) {
		for (int i=1; i<dimension+1;i++) {
			for(int j=1; j<dimension+1;j++) {
				System.out.print(dato(i,j)+"");
			}
			System.out.println("");
		}
	}
	
	public static void main (String[]args) {
		cuadrado(5);
	}
}