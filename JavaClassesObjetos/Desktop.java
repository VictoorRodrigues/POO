package JavaClassesObjetos;

public class Desktop {
	
	String placaMae;
	String processador;
	int memoriaRam;
	int ssd;
	String placaDeVideo;
	boolean ligado;	
	boolean impressora;
	
	void pesquisar() {
		if (ligado ==true) {
			System.out.println("Pronto para pesquisar");
		}else {
			System.out.println("O cumputador esta desligado");
			System.out.println("Ligando...");
			this.ligado = true;
		}
	}
	void baixarArquivo() {
		if (impressora ==true) {
			System.out.println("Pronta para imprimir");
		}else {
			System.out.println("Nao possui impressora");
		}
	}

}
