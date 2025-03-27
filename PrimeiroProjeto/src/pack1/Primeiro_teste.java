package pack1;
import java.util.Scanner;
public class Primeiro_teste {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float h = 0;
		float b = 0;
		float B = 0;
		System.out.println("Insira a altura");
		h = teclado.nextInt();
		System.out.println("Insira a base menor");
		b = teclado.nextInt();
		System.out.println("Insira a base maior");
		B = teclado.nextInt();
		System.out.println((h*(b + B ) / 2));
		teclado.close();
		
	}

}
