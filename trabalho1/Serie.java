package trabalho1;

public class Serie implements Video{
	
	private int duracao;
	private String idiomaAudio;
	private String idiomaLegenda;
	private boolean estaPausado;
	private String nome;
	private int temporadas;
	private int episodiosPorTemporada;
	private boolean primeiroPlay;
	
	public Serie(String nome, int temporadas, int episodiosPorTemporada) {	
		this.nome = nome;
		this.temporadas = temporadas;
		this.episodiosPorTemporada = episodiosPorTemporada;
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
		System.out.println("Nome da Serie: "+this.nome +"\n" + "Quantidade de temporadas: "+this.temporadas + "\n"+ "Episodios por temporada: " + this.episodiosPorTemporada + "\n" + "Duracao de cada episodio: "+ this.duracao + " minutos");
		return null;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
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
