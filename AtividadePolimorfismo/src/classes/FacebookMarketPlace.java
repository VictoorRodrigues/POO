package classes;

public class FacebookMarketPlace extends Facebook {

	

	public FacebookMarketPlace(String nome, int numero, String apelido) {
		super(nome, numero, apelido);
	}
	
	public void fazerAnuncio(String nome, double preco) {
		System.out.println("NOME: "+nome  + " R$: " +preco);
	}
	
	public void fazerAnuncio(String nome, int preco) {
		System.out.println("NOME: "+nome  + " R$: " +preco );
	}
	
	public void fazerAnuncio(String nome, double preco, int quantidadeDeParcelas) {
		System.out.println("NOME: "+nome +  " R$: " +preco);
		System.out.println("PARCELAMENTO: "+quantidadeDeParcelas + "X" + preco );
	}
	
	@Override
	public void conversar() {
		System.out.println("Voce esta conversando com o possivel comprador");
	}
	
	@Override
	public void postarFoto() {
		System.out.println("Voce postou outra foto no anuncio");
	}

	@Override
	public void mandarAudio() {	
		System.out.println("Voce mandou um audio para o comprador");
	}
	

}
