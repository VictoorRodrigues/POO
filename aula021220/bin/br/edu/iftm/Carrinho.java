package aula021220.bin.br.edu.iftm;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private double valorTotal;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionar(Produto produto) {
		produtos.add(produto);
		valorTotal += produto.getPreco();
;	}

	public double getTotal() {
		return valorTotal;
	}

	public void mostrarProdutos() {
		System.out.println("PRODUTOS DO CARRINHO");
		for (Produto produto : produtos) {
			System.out.format("%s (categoria: %s) - R$%.2f \n", produto.getNome(), produto.getCategoria(), produto.getPreco());
		}
		System.out.println("VALOR TOTAL DOS PRODUTOS : R$"+	valorTotal);
	}
	
}
