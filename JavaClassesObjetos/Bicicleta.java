package JavaClassesObjetos;

public class Bicicleta {
	
		String marca;
		double tamanho;
		String cor;
		boolean manutencao;
		int LibrasDoPneu;
		
		void andarDeBicicleta() {
			if (manutencao == true) {
				System.out.println("Bicicleta pronta para andar");
				
			}else {
				System.out.println("Bicicleta precisa de manutencao");
			}
		}
		
		void CalibrarPneu() {
			if (LibrasDoPneu==40) {
				System.out.println("Pneus estao calibrados");
			}else {
				System.out.println("Pneus precisam ser calibrados");
			}
		}

}
