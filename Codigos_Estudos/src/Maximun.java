import java.util.Scanner;

public class Maximun {
	
	public void determinaMaximun() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros Decimais, separado por Espaco: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		double resultado = max(num1,num2,num3);
		
		System.out.println("O maior e: " + resultado);
		
		in.close();
	}
	public double max(double x,double y,double z) 
	{
	double maxValor = x;
	
	if( y > maxValor)
		maxValor = y;
	
	if(z > maxValor)
		maxValor = z;
	
	//return maxValor;
	
	return Math.max(x,Math.max(y,z));
	}
}
