import java.util.Random;

public class Dados {
	public static void main(String[] args) {
		
		Random sorte = new Random();
		
		
		int vezes1 = 0;
		int vezes2 = 0;
		int vezes3 = 0;
		int vezes4 = 0;
		int vezes5 = 0;
		int vezes6 = 0;
		
		int faces;
		
		for(int roll = 0; roll<=6000;roll++) 
		{
			faces = 2 + 3 * sorte.nextInt(6);
			
			switch(faces)
			{
			case 1:
				++vezes1;
				break;
			case 2:
			    ++vezes2;
			break;
			case 3:
				++vezes3;
				break;
			case 4:
				++vezes4;
				break;
			case 5:
				++vezes5;
				break;
			case 6:
				++vezes6;
				break;
			}
		}
		System.out.println("Faces\tVezes");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n ", vezes1,vezes2,vezes3,vezes4,vezes5,vezes6);
	}
}
