import java.util.Scanner;

public class exerc�cio3 {

	public static void main(String[] args) {
		
		
        int valor;
        Scanner leitor = new Scanner (System.in);
				
		System.out.println ("Digite o seu sal�rio");	
		valor = leitor.nextInt();
		
		if (valor >=0 && valor <=1000) {
		System.out.println("Voc� recebeu um aumento de 15%, seu novo sal�rio agora � de "+(valor+(valor/100*15)));
		}
		
		else if (valor >1000  && valor <= 2500){
		System.out.println("Voc� recebeu um aumento de 7%, seu novo sal�rio agora � de "+(valor+(valor/100*7)));
		}
		
		else if (valor >2500 ){
		System.out.println("Voc� n�o recebeu aumento, seu sal�rio continua no valor de "+(valor));
		}
			
		
		
		
		
		
		
		
		
		

	}

}
