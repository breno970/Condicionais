import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {
	
		int num;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println ("Digite Um N�mero Entre 20 e 90.");
		num = leitor.nextInt();
		
		if (num >20 && num<90) {
			System.out.printf("O n�mero %d est� compreendido entre 20 e 90...", num);
		}
		else
			System.out.printf("O n�mero %d n�o est� compreendido entre 20 e 90",num);
		
		
		
		
		}
	}
