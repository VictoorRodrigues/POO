package classes;

public class Medico extends Pessoa{
	private int CRM;
	private double salario;
	
	public Medico(String nome, int idade, String sexo, int CRM, double salario) {
		super(nome, idade, sexo);
		this.CRM = CRM;
		this.salario = salario;
	}
	
	public void curarPaciente() {
		String identidade = pegarIdentidade();
		System.out.printf("%s foi curado. \n" , identidade);
	}
	
	@Override
	public void relatorio() {
		System.out.format("MEDICO \nNome: %s \nIdade: %d \nSexo: %s \nCRM: %d \nSalario: %.2f \n", getNome(), getIdade(), getSexo(), CRM, salario);
	}
	
	public void receber(){
		salario = salario;
		System.out.format("O medico %s recebe R$%.2f \n", getNome(), salario);
	}
	
	public void receber(double aumentoSalario){  
        salario = salario+ aumentoSalario;
        System.out.format("O %s recebeu um aumento de R$%.2f e seu salario atual é: R$%.2f.\n\n", getNome(), aumentoSalario, salario);
    }

	
	
	

}
