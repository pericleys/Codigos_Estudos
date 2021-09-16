//import java.util.Scanner;

import javax.swing.JOptionPane;


public class SomaBoxDialogo {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		
		//int num1;
		//int num2;
		//int soma;
		
		//System.out.println("Primeiro Numero");
		//num1 = in.nextInt();
		
		//System.out.println("Digite o segundo Numero");
		//num2 = in.nextInt();
		
		//soma = num1+num2;
		
		//System.out.printf("A soma dos numero e %d",soma);
		//in.close();
		
		String num = JOptionPane.showInputDialog("Digite o valor Pra soma");
		Integer.parseInt(num);
		
		String num2 = JOptionPane.showInputDialog("Digite o Segundo valor");
		Integer.parseInt(num2);
		
		int soma = Integer.parseInt(num)+Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null,"A soma dos Valores e " + soma);
		
		//in.close();
	}
	
}
