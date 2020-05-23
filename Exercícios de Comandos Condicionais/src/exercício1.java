import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
	
		int num;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println ("Digite Um Número Entre 20 e 90.");
		num = leitor.nextInt();
		
		if (num >20 && num<90) {
			System.out.printf("O número %d está compreendido entre 20 e 90...", num);
		}
		else
			System.out.printf("O número %d não está compreendido entre 20 e 90",num);
		
		
		
		
		}
	}
