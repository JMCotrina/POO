
public class EjerResueltop110 {
	
	public static int calculaFactorial (int num)
	{
			if (num==0) return 1;
			return num * calculaFactorial(num-1); //3 * 2! -> 3*2 ->6
											   			//2 * 1! ->2 *1 ->2
												   			//1 * 0! -> 1
													   			//1
	}
	
	public static void main (String [] args) {
			System.out.println("El factorial de 0 es : "+calculaFactorial(0));
			System.out.println("El factorial de 1 es : "+calculaFactorial(1));
			System.out.println("El factorial de 2 es : "+calculaFactorial(2));
			System.out.println("El factorial de 3 es : "+calculaFactorial(3));
			System.out.println("El factorial de 4 es : "+calculaFactorial(4));
			System.out.println("El factorial de 5 es : "+calculaFactorial(5));
			System.out.println("El factorial de 6 es : "+calculaFactorial(6));
			System.out.println("El factorial de 7 es : "+calculaFactorial(7));
			System.out.println("El factorial de 8 es : "+calculaFactorial(8));
			System.out.println("El factorial de 9 es : "+calculaFactorial(9));
	}
}
