import java.util.Scanner;

public class ImplementacaoNota {
	
	private String nomeCurso;
	
	public ImplementacaoNota(String nome) {
		nomeCurso = nome;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	} 
	
	public String getnomeCurso() {
		return nomeCurso;
	}
	
	public void Menssagem()
	{
		System.out.printf("Bem Vindo ao Curso %s \n",getnomeCurso());
	}
		
	public void tamanhodaClasse() 
	{
		Scanner in = new Scanner(System.in);
		
		int total;
		int contNta;
		int notasInse;
		double media;
		
		total = 0;
		contNta = 0;
		
			System.out.println("Digite as notas ou digite -1 pra sair:");
			notasInse = in.nextInt();
			
			while(notasInse !=-1) {
				
				total = total + notasInse;
				contNta = contNta +1;
				
				System.out.println("Digite -1 pra sair");
				notasInse = in.nextInt();
			}
			if(contNta !=0)
			{
				media = (double) total / contNta;
				System.out.printf("\n Total de notas Digitadas foi %d \n "
						+ "O total de todas as Notas e %d \n",contNta,total);
				
				System.out.printf("A media da Classe e %.2f\n",media);
			}
			else
				System.out.println("\nNenhuma Nota foi Inserida");
			
			in.close();
		}
		
	}

