package classes;

public class Paciente extends Pessoa{
	private String sintomas;
	private String pagamento;
	
	public Paciente(String nome, int idade, String sexo, String sintomas, String pagamento) {
		super(nome, idade, sexo);
		this.sintomas = sintomas;
		this.pagamento = pagamento;
	}
	
	
	public final void morrer() {
		System.out.println("O paciente morreu!!");
		String identidade = pegarIdentidade();
		super.relatorio();
	}
	
	
}
