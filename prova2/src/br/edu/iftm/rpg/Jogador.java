package br.edu.iftm.rpg;

public class Jogador {
	private int vida;
	private String nome;
	private int dano;
	
	public Jogador (int vida, String nome, int dano) {
		this.vida = vida;
		this.nome = nome;
		this.dano = dano;
	}
	public void atacar(Inimigo inimigo) {			
		if(vida>=0) {
			System.out.format("\n%s atacou o %s \n", nome, inimigo.getNome());
			inimigo.perderVida(dano);
			System.out.println();
		}	
		else if(vida<=0) {
			System.out.format("%s morreu e nao pode atacar \n", nome);
		}
	}
	public void perderVida(int pontos) {
		System.out.format("O inimigo %s perdeu %d pontos de vida \n", nome, pontos);
		vida = vida-pontos;
		if(vida<=0) {
			System.out.println("O Inimigo morreu \n");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
}
