package trabalho1;

public class Principal {

	public static void main(String[] args) {
		Serie GoT = new Serie("Game of Thrones", 8, 10);
		GoT.setDuracao(60);
		GoT.setEstaPausado(false);
		GoT.setIdiomaAudio("PortuguÍs (Brasil)");
		GoT.setIdiomaLegenda("PortuguÍs (Brasil)");
		
		GoT.executar();
		GoT.executar();
		GoT.mudarAudio();
		GoT.mudarAudio();
		GoT.mudarAudio();
		GoT.mudarLegenda();
		GoT.mudarLegenda();
		GoT.exibirDetalhes();
		System.out.println();
		
		
		Serie Vikings = new Serie("Vikings", 10, 6);
		Vikings.setDuracao(50);
		Vikings.setEstaPausado(false);
		Vikings.setIdiomaAudio("iNGLES");
		Vikings.setIdiomaLegenda("PortuguÍs (Brazil)");
		
		Vikings.executar();
		Vikings.executar();
		Vikings.mudarAudio();
		Vikings.mudarAudio();
		Vikings.mudarAudio();
		Vikings.mudarLegenda();
		Vikings.mudarLegenda();
		Vikings.exibirDetalhes();
		System.out.println();
		
		Filme euSouALenda = new Filme("euSouALenda", 120, 2008, "Francis Lawrence");
		euSouALenda.setIdiomaAudio("PortuguÍs (Brasil)");
		euSouALenda.setIdiomaLegenda("PortuguÍs (Brasil)");
		euSouALenda.setEstaPausado(false);
		
		euSouALenda.executar();
		euSouALenda.executar();
		euSouALenda.mudarAudio();
		euSouALenda.mudarAudio();
		euSouALenda.mudarAudio();
		euSouALenda.mudarLegenda();
		euSouALenda.mudarLegenda();
		euSouALenda.exibirDetalhes();
		System.out.println();
		
		Filme Hobbit = new Filme("Hobbit", 240, 2012, "Peter Jackson");
		Hobbit.setIdiomaAudio("PortuguÍs (Brasil)");
		Hobbit.setIdiomaLegenda("PortuguÍs (Brasil)");
		Hobbit.setEstaPausado(true);
		
		Hobbit.executar();
		Hobbit.executar();
		Hobbit.mudarAudio();
		Hobbit.mudarAudio();
		Hobbit.mudarAudio();
		Hobbit.mudarLegenda();
		Hobbit.mudarLegenda();
		Hobbit.pausar();
		Hobbit.pausar();
		Hobbit.exibirDetalhes();
		System.out.println();

	}

}
