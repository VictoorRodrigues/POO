package classes;

public class Facebook extends RedeSocial {
	private String apelido;
	
	public Facebook(String nome, int numero, String apelido) {
		super(nome, numero);
		this.apelido = apelido;
	}
	
	public void cutucar(String nome) {
		System.out.println("Voce cutucou "+nome );
	}
	
	public void adicionarAmigo(int id) {
		System.out.println("O ID digitado foi "+id + " e sera adicionado como amigo");
	}
	
	public void adicionarAmigo(String nomeAmigo) {
		System.out.println("O nome digitado foi "+nomeAmigo + " e sera adicionado como amigo");
	}
	
	public void AdicionarAmigo(String nomeAmigo, int id) {
		System.out.format("NOME: %s \nID: %d\n\n",nomeAmigo, id);
	}
	
	
	@Override
	public void conversar() {
		System.out.format("NOME: %s \nNUMERO: %d \nAPELIDO: %S \n", getNome(),getNumero(), apelido);
		System.out.println("Esta conversando com amigos do facebook");
	}
	
	@Override
	public void postarFoto() {
		System.out.println("Voce postou uma foto muito esbelta");
	}

	@Override
	public void mandarAudio() {	
		System.out.println("Voce mandou 3 dias de audios");
	}
	
	
	

}
