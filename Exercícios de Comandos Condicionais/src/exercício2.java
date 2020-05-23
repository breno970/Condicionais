import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
	//Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias
		
		int idade;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println ("Digite a idade do Nadador...");
		idade = leitor.nextInt();
		
		if (idade > 5 && idade <  10 ) {
			System.out.println ("Categoria Infantil");
		}
		else if (idade > 11 && idade < 17) {
		    System.out.println ("Categoria Juvenil");
		}
		else if (idade > 18) {
		    System.out.println ("Categoria Adulto");
		}
		
		
		
		
		

	}

}
