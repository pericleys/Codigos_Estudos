import java.util.Random;

public class JogoDeDados {
	
	private Random sorteNumeros = new Random();
	
	private enum Status{ Continue,WON,LOST};
	
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEM = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CAR = 12;
	
	public void play()
	{
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
		case SEVEM:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CAR:
			gameStatus = Status.LOST;
			break;
			default:
				gameStatus = Status.Continue;
				myPoint =  sumOfDice;
				System.out.printf("Ponto e %d\n ",myPoint);
				break;
		}
		
		while (gameStatus == Status.Continue)
		{
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else
				if(sumOfDice == SEVEM)
					gameStatus = Status.LOST;
		}
		if(gameStatus == Status.WON)
			System.out.println("Jogador Venceu!! ");
		else
			System.out.println("Jogador Perdeu!! ");
	}
	
	public int rollDice() {
		int die1 = 1 + sorteNumeros.nextInt(6);
		int die2 = 1 + sorteNumeros.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("O jogador Jogou %d + %d = %d \n ",die1,die2,sum);
		
		return sum;
	}
	

}
