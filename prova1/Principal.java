package prova1;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Victor Luz Rodrigues", 11111, "Rua 1 numero 1", "Victor@hotmail.com", 12313, false, "16 de setembro");

		cliente.infoPrincipais();
		cliente.temPendencias();
		
		Livro livro = new Livro("As cronicas de Gelo e Fogo", "George R.R Martin", 591, 55.90, false );
		
		if(livro.isCondicaoLivro()==true) {
			System.out.println("o livro esta em boas condicoes");
		}else {
			System.out.println("O livro esta em pessimas condicoes");
		}
		System.out.println(livro.comprarLivro(5));
		
		Livraria livraria = new Livraria("Livraria01", 275, "livraria@hotmail.com", "rua 2 numero 2", true, false);
		
		
		livraria.statusLivraria();
		livraria.verificarEstoque();

	}

}
