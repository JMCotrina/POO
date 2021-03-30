	public class bebe {
		
		bebe(int i){
			this("Soy un bebe consentido");
			System.out.println("Hola, tendo " +i + " meses");
		}
		
		bebe(String s){
			System.out.println(s);
		}
		
		//Método
		void berrea() {
			System.out.println("Buaaaaaaaa");
		}
		
		//Método principal
		public static void main(String[] args) {
			new bebe(9).berrea();
			        //Parametro
		}
	}
