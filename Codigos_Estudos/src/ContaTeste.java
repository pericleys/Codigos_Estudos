import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta1= new Conta(50.0);
		Conta conta2 = new Conta(-7.53);
		
		System.out.printf("Conta $%.2f \n",conta1.getbalanca());
		System.out.printf("Conta $%.2f \n",conta2.getbalanca());
		
		Scanner in = new Scanner(System.in);
		
		double depositoDinheiro;
		
		System.out.println("Digite o valor pra deposito na Conta 1: \n");
		depositoDinheiro = in.nextDouble();
		System.out.printf("Valor atual na Conta 1 %.2f \n",depositoDinheiro);
		
		conta1.Credito(depositoDinheiro);
		
		System.out.printf("Conta 1 Saldo %.2f \n",conta1.getbalanca());
		System.out.printf("Conta 2 Saldo %.2f \n",conta2.getbalanca());
		
		System.out.println("Digite o Valor a ser depositado conta 2 \n");
		depositoDinheiro = in.nextDouble();
		System.out.printf("Valor da Conta 2 %.2f \n",depositoDinheiro);
		conta2.Credito(depositoDinheiro);
		
		System.out.printf("Saldo conta 1 %.2f \n",conta1.getbalanca());
		System.out.printf("Saldo conta 2 %.2f \n",conta2.getbalanca());
		
		in.close();
	}
}
