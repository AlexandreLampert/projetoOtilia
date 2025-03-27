package Br.edu.unoesc;
import java.util.Scanner;

public class aula_13_03 {
	public static void main(String[] args) {
	int [] a = new int[10];
	int [] b = new int[10];
	float [] c = new float[10];
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informe 10 números inteiros para o A\n");
	for (int i = 0; i < 10; i++) {
        a[i] = teclado.nextInt();
	}
	System.out.println("Informe 10 números inteiros para o B\n");
	for (int i = 0; i < 10; i++) {
        b[i] = teclado.nextInt();
	}
	juntar(a,b,c);
	System.out.println("Numeros pares do vetor a");
	int i ;
	for ( i = 0; i < 10; i++) {
		if(a[i] % 2 == 0) 
			System.out.print(a[i] + " ");
		}
}
	public static void juntar(int a[],int b[],float c[]) {
		System.out.println("\nVetor C (invertido):");
        for (int i = 9; i >= 0; i--) {
            if (b[i] != 0) {
                c[i] = (float)a[i] / b[i];
                System.out.println("c[" + i + "]: " + c[i]);
			} else {
				System.out.println("Divisão por 0 " +  i);
        	
		}
		}
		
	}
}

