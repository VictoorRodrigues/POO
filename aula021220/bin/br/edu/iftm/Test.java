package aula021220.bin.br.edu.iftm;

public class Test {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Monster", "Energetico", 8.50);
		Produto produto2 = new Produto("XT660", "moto", 25.500);
		Produto produto3 = new Produto("Razer","teclado", 755.25);
		
		Carrinho carrinho1 = new Carrinho();
		carrinho1.adicionar(produto1);
		carrinho1.adicionar(produto2);
		carrinho1.adicionar(produto3);
		
		carrinho1.mostrarProdutos();
	}

}
