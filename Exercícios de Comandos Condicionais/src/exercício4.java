import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
	float a,b,c;
	int x,y,z;	
		
	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite o primeiro valor: ");
	x=leitor.nextInt();
	
	System.out.print("Digite o segundo valor: ");
	y=leitor.nextInt();
	
	System.out.print("Digite o terceiro valor: ");
	z=leitor.nextInt();
	
	if(x==y && x==z && z==y){
		System.out.printf("Tri�ngulo equil�tero.");}
	
	else if(x==y || y==z || y==z || x==z || z==x || y==z){
		System.out.printf("Tri�ngulo is�sceles.");}
	
	else{
		System.out.printf("Tri�ngulo escaleno.");
	}
}

}
