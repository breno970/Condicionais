import java.util.Scanner;

public class exerc�cio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int mat;
		float w,x,y,z,media;
		
		System.out.print("Digite o n�mero da sua matr�cula: ");
		mat=entrada.nextInt();
		
		System.out.print("Digite a primeira nota: ");
		w=entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		x=entrada.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		y=entrada.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		z=entrada.nextFloat();
		
		media=(w+x+y+z)/4;
		if(media>=7.00){
			
			System.out.println("Matr�cula: "+mat+" \n"
					+ "M�dia final: "+media+" \n"
					+"Aluno aprovado.");}
		
		else if(media>=3.5 && media<=7.0){
			System.out.println("Matr�cula: "+mat+" \n"
					+ "M�dia final: "+media+" \n"
					+"Aluno em recupera��o.");}
		
		else if(media<=3.5){
			System.out.println("Matr�cula: "+mat+" \n"
					+ "M�dia final: "+media+" \n"
					+"Aluno reprovado.");}
		
		
	}

}
