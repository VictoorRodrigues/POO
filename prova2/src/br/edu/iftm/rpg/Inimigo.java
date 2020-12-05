package br.edu.iftm.rpg;

public class Inimigo {
	private int vida;
	private String nome;
	private int dano;
	
	public Inimigo(int vida, String nome, int dano) {
		this.nome = nome;
		this.vida = vida;
		this.dano = dano;
	}
	public void atacar(Jogador jogador) {
		if(vida>=0) {
			System.out.format("\n%s atacou o %s \n", nome, jogador.getNome());
			jogador.perderVida(dano);
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
