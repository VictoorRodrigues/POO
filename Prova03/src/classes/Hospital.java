package classes;

public final class Hospital{
	private String nome;
	private int numero;
	
	
	public Hospital(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public void statusHospital(String status) {
		System.out.println(status);
	}
	
	public final void falir() {
		System.out.format("Hospital %s faliu",nome);
	}
	
	
}
