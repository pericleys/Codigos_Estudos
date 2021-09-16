import java.util.Scanner;

public class ContadorSwitch {
	
	private String nomeCurso;
	private int conter;
	private int aCont;
	private int bCont;
	private int cCont;
	private int dCont;
	private int fCont;
	private int total;
	
	public ContadorSwitch(String nome) {
		nomeCurso = nome;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public void menssagem() {
		System.out.printf("Bem vindo ao ContadorSwitch %s",getNomeCurso());
	}
	
	public void entrada() {
		Scanner in = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite um numero entre 0 - 100 ou digite ctrl + z para sair");
		
		while(in.hasNext())
		{
			nota = in.nextInt();
			total += nota;
			++conter;
			
			incrementeasNotas(nota);
		}
		in.close();
	}
		
	public void incrementeasNotas(int nota) {
			switch (nota / 10)
			{
			case 9:
			case 10:
				++conter;
				break;
			
			case 8:
				++bCont;
				break;
			case 7:
				++cCont;
				break;
			case 6:
				++dCont;
				break;
				
				default:
					++fCont;
					break;
		}
	}
			public void report() 
			{
				System.out.println("Notas Relatorio \n");
				
				if(conter != 0)
				{
					double soma = (double) total / conter;
					
					System.out.printf("O total de notas e %d as notas digitadas foi %d \n",conter,total);
					System.out.printf("A media total e %.2f \n ",soma);
					System.out.printf("%s \n %s \n %s \n %s  \n %s  \n %s ","Numero de Estudantes que receberam notas baixas",
							"A",aCont,
							"B",bCont,
							"C",cCont,
							"D",dCont,
							"F",fCont
							);
				}
				else
					System.out.println("Vc nao Digitou nenhum Numero");
				
				}
			}
	
	
