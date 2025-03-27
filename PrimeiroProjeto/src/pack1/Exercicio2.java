package pack1;

import java.util.Calendar;

public class Exercicio2 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int dia = calendario.get(Calendar.DAY_OF_MONTH );
		System.out.printf("Dia = %d", dia );
	}

}
