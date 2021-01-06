package classes;

public abstract class RedeSocial {
	private String nome;
	private int numero;
	
	public RedeSocial(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public abstract void conversar();
	
	public abstract void postarFoto();
	
	public abstract void mandarAudio();

	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
}
