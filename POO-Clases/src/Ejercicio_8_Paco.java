
public class Ejercicio_8_Paco {
		public void primero() {
			System.out.println("Soy primero");
		}
		
		public void segundo() {
			primero();
			this.primero();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Ejercicio_8_Paco miEjercicio = new Ejercicio_8_Paco();
			miEjercicio.segundo();
		}
	}

