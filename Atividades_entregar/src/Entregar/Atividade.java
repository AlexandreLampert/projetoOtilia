package Entregar;
import java.util.Scanner;

public class Atividade {
	//5.2 Ler um string e criar outro string a partir desse em ordem inversa de todo o string.  
	//(usar StringBuilder, append e reverse).

	public static void main(String[] args) {
		//crio a main stringbuilder para adicionar uma string
		StringBuilder frase = new StringBuilder("tentativa ");		
		System.out.println(frase);
		inverter(frase);
		
	}
	//crio um metodo para inverter
	public static void inverter (StringBuilder frase) {
		//adiciono uma nova string para armazenar o string invertido
		StringBuilder frase2 = frase ;
		frase2.append(" 1 , 2 , 3 ");
		System.out.println(frase.toString());
        frase2.reverse();//inverto a string 
        System.out.println("Texto invertido: " + frase2 );//mostro elas em conjunto invertidas
	}

}
