import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		
		
        int valor;
        Scanner leitor = new Scanner (System.in);
				
		System.out.println ("Digite o seu salário");	
		valor = leitor.nextInt();
		
		if (valor >=0 && valor <=1000) {
		System.out.println("Você recebeu um aumento de 15%, seu novo salário agora é de "+(valor+(valor/100*15)));
		}
		
		else if (valor >1000  && valor <= 2500){
		System.out.println("Você recebeu um aumento de 7%, seu novo salário agora é de "+(valor+(valor/100*7)));
		}
		
		else if (valor >2500 ){
		System.out.println("Você não recebeu aumento, seu salário continua no valor de "+(valor));
		}
			
		
		
		
		
		
		
		
		
		

	}

}
