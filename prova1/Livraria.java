package prova1;

import java.util.Calendar;
import java.util.Date;

public class Livraria {
	private String nomeLivraria;
	private int numeroLivraria;
	private String emailLivraria;
	private String enderecoLivraria;
	private boolean estoque;
	private boolean livrariaOrganizada;
	
	public Livraria (String nomeLivraria, int numeroLivraria, String emailLivraria, String enderecoLivraria, boolean estoque, boolean livrariaOrganizada) {
		this.nomeLivraria = nomeLivraria;
		this.numeroLivraria = numeroLivraria;
		this.emailLivraria = emailLivraria;
		this.enderecoLivraria = enderecoLivraria;
		this.estoque = estoque;
		this.livrariaOrganizada = livrariaOrganizada;
	}
	void verificarEstoque() {
		if (estoque == true) {
			System.out.println("O livro esta no estoque");
		}else {
			System.out.println("Nao possuimos esse livro");
		}
	}
	
	void statusLivraria() {
		System.out.println("Nome livraria: "+nomeLivraria);
		System.out.println("Endereco livraria: "+ enderecoLivraria);
		if (livrariaOrganizada ==false) {
			System.out.println("A livraria esta desorganizada!");
			organizarLivraria();
		}else {
			System.out.println("A livraria esta organizada");
		}
	}
	
	private void organizarLivraria() {
		System.out.println("A livraria foi organizada!");
		livrariaOrganizada = true;
		
	}
	
	
}
