package prova1;

public class Livro {
	private String nomeLivro;
	private String nomeAutor;
	private int numPaginas;
	private double precoLivro;
	private boolean condicaoLivro;

	
	public Livro(String nomeLivro, String nomeAutor, int numPaginas, double precoLivro, boolean condicaoLivro) {
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.numPaginas = numPaginas;
		this.precoLivro = precoLivro;
		this.condicaoLivro = condicaoLivro;
	}
	
	void statusLivro() {
		
		if (condicaoLivro == true) {
			System.out.println("O livro esta em boas condicoes");
		}else {
			repararLivro();
			this.condicaoLivro = true;
		}	
	}
	
	double comprarLivro (int quantidadeDeLivros){
		System.out.print("o preco a pagar e R$: ");
		return precoLivro*quantidadeDeLivros;
		
	}
	
	private void repararLivro() {
		System.out.println("O livro sera reparado");
		condicaoLivro = true;
	}
	

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public double getPrecoLivro() {
		return precoLivro;
	}

	public void setPrecoLivro(double precoLivro) {
		this.precoLivro = precoLivro;
	}

	public boolean isCondicaoLivro() {
		return condicaoLivro;
	}

	public void setCondicaoLivro(boolean condicaoLivro) {
		this.condicaoLivro = condicaoLivro;
	}
}
