package classes;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa (String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	protected String pegarIdentidade() {
		if (sexo.equalsIgnoreCase("masculino ")) {
			//"O <nome>"
			return String.format("O %s \n", nome);
			
		}else {
			//"A <nome>"
			return String.format("A %s \n", nome);
		}
	}
	
	public void fazerAniversario() {
		String identidade = pegarIdentidade();
		System.out.printf("%s fez aniversario! \n", identidade);
	}
	
	public void relatorio() {
		System.out.format("Nome: %s \nIdade: %d \nSexo: %s \n\n", getNome(), getIdade(), getSexo());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
}
