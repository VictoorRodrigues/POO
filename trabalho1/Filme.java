package trabalho1;

public class Filme implements Video {
	
	private int duracao;
	private String idiomaAudio;
	private String idiomaLegenda;
	private boolean estaPausado;
	private String nome;
	private int anoLancamento;
	private String diretor;
	private boolean primeiroPlay;
	
	public Filme(String nome, int duracao, int anoLancamento, String diretor) {
	this.nome = nome;
	this.duracao = duracao;
	this.anoLancamento = anoLancamento;
	this.diretor = diretor;
	}
	@Override
	public void executar() {
		if(primeiroPlay == false) {
			primeiroPlay = true;
			System.out.println("Começou a assistir "+ nome );
		}else {
			System.out.println("O video esta sendo executado!");
			estaPausado = false;
		}	
		
	}

	@Override
	public void pausar() {	
		if (estaPausado==false) {
			System.out.println("O video foi pausado!");
			estaPausado = true;
		}else {
			System.out.println("O filme ja esta pausado");
		}
	}

	@Override
	public void mudarAudio() {
		if(idiomaAudio == "Portugues(Brazil)") {
			idiomaAudio = "Inglês (Original)";
			System.out.println("Idioma do Audio: "+idiomaAudio);
		}else {
			idiomaAudio = "Portugues(Brazil)";
			System.out.println("Idioma do Audio: "+idiomaAudio);
		}
		
		
	}

	@Override
	public void mudarLegenda() {
		if (idiomaLegenda == "Português (Brasil)") {
			idiomaLegenda = "Sem Legenda";	
			System.out.println("Idioma da Legenda: "+idiomaLegenda);
		}else {
			idiomaLegenda = "Português (Brasil)";
			System.out.println("Idioma da Legenda: "+idiomaLegenda);
		}
		
	}

	@Override
	public String exibirDetalhes() {
		System.out.println("Nome do filme: " + this.nome +"\n" + "anoLancamento: "+this.anoLancamento + "\n" + "Diretor: "+this.diretor + "\n" + "Duracao: "+this.duracao);
		return null;
	}
	
	public String getIdiomaAudio() {
		return idiomaAudio;
	}
	public void setIdiomaAudio(String idiomaAudio) {
		this.idiomaAudio = idiomaAudio;
	}
	public String getIdiomaLegenda() {
		return idiomaLegenda;
	}
	public void setIdiomaLegenda(String idiomaLegenda) {
		this.idiomaLegenda = idiomaLegenda;
	}
	public boolean isEstaPausado() {
		return estaPausado;
	}
	public void setEstaPausado(boolean estaPausado) {
		this.estaPausado = estaPausado;
	}

	
}
