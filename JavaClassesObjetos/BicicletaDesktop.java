package JavaClassesObjetos;

public class BicicletaDesktop {

	public static void main(String[] args) {
		Desktop desktop1 = new Desktop();
		
		System.out.println("Esta ligado: " + desktop1.ligado);
		desktop1.placaMae = "Z390";
		desktop1.processador = "I5 7400";
		desktop1.memoriaRam = 8;
		desktop1.ssd = 1;
		desktop1.placaDeVideo = "GTX 980TI";
		desktop1.ligado = false;
		desktop1.impressora = false;
		desktop1.pesquisar();
		desktop1.baixarArquivo();
			
		Bicicleta bicicleta1 = new Bicicleta();
		bicicleta1.marca = "Specialized";
		bicicleta1.tamanho = 21;
		bicicleta1.cor = "Preta com Vermelho";
		bicicleta1.manutencao = false;
		bicicleta1.andarDeBicicleta();
		bicicleta1.CalibrarPneu();
		
		
		
		
		
		
		
		

	}

}
