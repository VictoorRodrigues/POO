package prova1;


import java.util.Date;

public class Cliente {
	private String nome;
	private int cpf;
	private String endereco;
	private String email;
	private int numCelular;
	private boolean pendencias;
	private boolean status;	
	private Date data = new Date();
	private String dataAniversario;

	public Cliente(String nome, int cpf, String edereco, String email, int numCelular, boolean pendencias, String dataAniversario) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.numCelular = numCelular;
		this.pendencias = pendencias;
		this.dataAniversario = dataAniversario;
	}
	
	void infoPrincipais() {
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Data da consulta: "+data);
		presentearCliente();
	}
	
	void temPendencias() {
		if (pendencias == true) {
			status = true;
			System.out.println("Nao pode pegar livro");
		}else {
			status = false;
			System.out.println("Pode pegar livro, nao ha pendendecias");
		}
	}
	
	private void presentearCliente() {
		System.out.println("O presente de aniversario do cliente e dia " +dataAniversario);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}

	public boolean isPendencias() {
		return pendencias;
	}

	public void setPendencias(boolean pendencias) {
		this.pendencias = pendencias;
	}
	
	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	
	
	
	
	
	
}
