package Entregar;
import java.util.Scanner;
public class Atividade_7_1 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.println("Digite três números inteiros entre 1 e 9:");
	        int num1 = entrada.nextInt();
	        int num2 = entrada.nextInt();
	        int num3 = entrada.nextInt();

	        int maior = encontrarMaior(num1, num2, num3);
	        mostrarTabelaMultiplicacao(maior);
	        mostrarSegundaTabelaMultiplicacao(maior);
	        entrada.close();
	    }

	    // Função para encontrar o maior número
	    public static int encontrarMaior(int num1, int num2, int num3) {
	        int maior = num1;
	        if (num2 > maior) {
	            maior = num2;
	        }
	        if (num3 > maior) {
	            maior = num3;
	        }
	        return maior;
	    }

	    // Função para mostrar a tabela de multiplicação do maior número
	    public static void mostrarTabelaMultiplicacao(int maior) {
	        System.out.println("\nTabela 1 - Multiplicação do maior número (" + maior + "):");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(maior + " x " + i + " = " + (maior * i));
	        }
	    }

	    // Função para mostrar a segunda tabela de multiplicação
	    public static void mostrarSegundaTabelaMultiplicacao(int maior) {
	        System.out.println("\nTabela 2 - Multiplicação do maior número (" + maior + ") com números ímpares:");
	        for (int i = 1; i <= 10; i += 2) {
	            System.out.println(maior + " x " + i + " = " + (maior * i));
	        }
	    }
	}


