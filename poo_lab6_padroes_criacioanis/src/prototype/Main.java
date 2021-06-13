package prototype;

public class Main {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		// criando c�rculo 1
		Circulo c1 = new Circulo(6, 8, 4);
		System.out.println(c1);
		System.out.println();		
		
		// clonando c1
		Prototype copia = c1.clonar();
		System.out.println("Cópia: " + copia);
		System.out.print("\n-----------------------------\n");
		
		// criando novo círculo
		Circulo c2 = new Circulo(12, 16, 8);
		System.out.println(c2);
		System.out.println();
		
		// clonando c2
		copia = c2.clonar();
		System.out.println("Cópia: " + copia);
		System.out.print("\n-----------------------------\n");
		
		// criando 3º círculo
		Circulo c3 = new Circulo(2, 11, 5);
		System.out.println(c3);
		System.out.println();
				
		// clonando c2
		copia = c3.clonar();
		System.out.println("Cópia: " + copia);
		System.out.println();
	 }
}
