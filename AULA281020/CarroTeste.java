package AULA281020;

import java.text.DecimalFormat;

public class CarroTeste {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Carro gol = new Carro();
		gol.setMarca("volkswagennn");
		gol.setModelo("Gol Sport");
		gol.setNumPassageiros(5);
		gol.setConsumoCombustivel(13);
		gol.setCapCombustivel(30);
		
		System.out.println(gol.getMarca());
		System.out.println(gol.getModelo());
		System.out.println(gol.getNumPassageiros());
		System.out.println(gol.getConsumoCombustivel());
		System.out.println(gol.getCapCombustivel());
		
		gol.exibirAutonomia();
		System.out.println(formatador.format(gol.calculaCombustivel(500)));

	}

}
