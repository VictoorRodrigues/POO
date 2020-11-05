package AULA281020;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro e: " + capCombustivel*consumoCombustivel + "km");
	}
	double obterAutonomia() {
		return capCombustivel*consumoCombustivel;
	}
	double calculaCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
}
