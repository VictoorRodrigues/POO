package Tests;

import classes.Hospital;
import classes.Medico;
import classes.Paciente;

public class Testes {

	public static void main(String[] args) {
		Paciente paciente = new Paciente("Victor", 20, "Masculino", "Dor de cabeca", "Pagamento feito");
		paciente.morrer();
		
		Medico medico = new Medico("Dr.Lucas", 192, "Masculino", 121517, 11500.25);
		
		
		medico.relatorio();
		medico.receber();
		medico.receber(12.50);
		
		Hospital hospital = new Hospital("Casa das massas", 190);
		
		hospital.falir();
		

		
	}

}
