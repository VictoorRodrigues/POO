package br.edu.iftm.rpg;

public class Luta {
	
	public void lutar(Jogador jogador, Inimigo inimigo) {
		jogador.atacar(inimigo);
		inimigo.atacar(jogador);
	}
}
