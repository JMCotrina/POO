	public class bebe {
		
		bebe(int i){
			this("Soy un bebe consentido");
			System.out.println("Hola, tendo " +i + " meses");
		}
		
		bebe(String s){
			System.out.println(s);
		}
		
		//M�todo
		void berrea() {
			System.out.println("Buaaaaaaaa");
		}
		
		//M�todo principal
		public static void main(String[] args) {
			new bebe(9).berrea();
			        //Parametro
		}
	}
