package strategy;

public class Divisao implements Strategy{

	@Override
	public int execute(int a, int b) {
		try {
			return a/b;
		}catch(ArithmeticException ex) {
			
			System.out.println("Não é possível dividir por zero");
			return 0;
		}
		
		
	}

}
