package builder;

public class ClasseCliente {

	public static void main(String[] args) {
		
		var veiculoBuilder = new VeiculoBuilderImplementa();
		
		var proprietario = new Proprietario(veiculoBuilder);
		
		
		var veiculoPopular = proprietario.construir("popular");
		System.out.println("Veículo Popular\n");
		System.out.println(veiculoPopular);
		System.out.println("\n---------------------\n");
		
		var veiculoImportado = proprietario.construir("importado");
		System.out.println("Veículo Importado\n");
		System.out.println(veiculoImportado);
		System.out.println("\n---------------------\n");
		
		
	
		
		

	}

}
