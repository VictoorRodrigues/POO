package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {

	public static void main(String[] args) {
		Inimigo life = new Inimigo (100, "The life Snake", 28);
		Inimigo zumbi = new Inimigo(100, "Zumbi", 15);
		Jogador victor = new Jogador(200, "Victor", 24);
		
		Luta luta = new Luta();
		luta.lutar(victor, life);
		luta.lutar(victor, zumbi);
		luta.lutar(victor, life);
		luta.lutar(victor, zumbi);
		luta.lutar(victor, life);
		luta.lutar(victor, zumbi);
		luta.lutar(victor, life);
		luta.lutar(victor, zumbi);
		luta.lutar(victor, life);
		luta.lutar(victor, zumbi);
		
		luta.lutar(victor, zumbi);
		luta.lutar(victor, life);
		

	}

}
