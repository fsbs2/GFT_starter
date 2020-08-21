package avaliacao;
import java.util.Scanner;

public class Impar {

	public static void main(String[] args) {
		int start;
		int end;
		int i;
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Números impares de um intervalo");
		System.out.println("Digite o valor inicial");
		start = sc.nextInt();
		System.out.println("Digite o valor final");
		end = sc.nextInt();
		sc.close();
		
		for(i = start; i <= end;i++) {
			if(i%2==1) {
				System.out.print(" "+i);
			}
		}
		
	}

}
