import java.util.Scanner;

public class AnaliseNota {
	
	
	public void resultado() {
		
	Scanner in = new Scanner(System.in);
			
	int passou = 0;
	int reprovol = 0;
	int total =1;
	int resultado;
	
	while(total <=10) {
		
		System.out.println("Digite o Resultado (1 - passou: 2 - reprovado)");
		resultado = in.nextInt();
		
		if(resultado == 1) {
			passou = passou +1;
		}
		else
			reprovol = reprovol +1;
		
		total = total +1;
	}
	
		System.out.printf("Passou %d\n Reprovol %d \n", passou,reprovol);
		
		if(passou >8) {
			System.out.println("Almenta a Menssalidade");
		}
	
	
		
	in.close();
	
	}
}