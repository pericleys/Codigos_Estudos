import java.util.Random;

public class SorteInt {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		int faces;
		
		for(int cont = 0; cont <=20; cont++) 
		{
			faces = 1 + sorteio.nextInt(6);
			
			System.out.printf("%d ",faces);
			
			if(cont %5 == 0) 
			{
		System.out.println();		
			}
		}
	}
}
