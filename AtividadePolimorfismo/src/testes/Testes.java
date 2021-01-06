package testes;

import classes.Facebook;
import classes.FacebookMarketPlace;
import classes.RedeSocial;

public class Testes {
	
	private static void executar(RedeSocial redeSocial) {
		redeSocial.conversar();
		redeSocial.postarFoto();
		redeSocial.mandarAudio();
	}
	
	public static void main(String[] args) {
		Facebook facebook = new Facebook("Victor", 123, "Magrao");
		
		executar(facebook);
		facebook.adicionarAmigo(123);
		facebook.adicionarAmigo("Lucas Moura");
		facebook.AdicionarAmigo("Lucas Moura", 512);
		
		
		FacebookMarketPlace market = new FacebookMarketPlace("Victor", 123, "Magrao");
		executar(market);
		market.fazerAnuncio("Titan 150", 5.500);
		market.fazerAnuncio("S10", 1000);
		market.fazerAnuncio("Z750", 1250.50, 50);
	}

}
