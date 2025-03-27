package pack1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float valorHora = 0;
		float horaGanha = 0;
		System.out.println(" Digite quanto voce ganha por hora ");
		valorHora = teclado.nextFloat();
		System.out.println(" quantas horas voce trabalhou? ");
		horaGanha = teclado.nextFloat();
		System.out.format("Valor a receber =  %.2f", valorHora * horaGanha);

	}

}
