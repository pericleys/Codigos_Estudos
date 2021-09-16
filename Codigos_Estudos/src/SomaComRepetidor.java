import java.util.Scanner;

public class SomaComRepetidor {
	
	private String nomeCurso;
	
	public SomaComRepetidor(String nome) {
		nomeCurso = nome;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public void Menssagem()
	{
		System.out.printf("Bem vindo ao curso %s\n ",getNomeCurso());
	}
	
	public void NotadaClasse() {
		
		Scanner in = new Scanner(System.in);
		
		int total;
		int contador;
		int nota;
		int tamanho;
		
		total = 0;
		contador =1;
		
		while(contador <=10) {
			System.out.println("Digite as Notas\n");
			nota = in.nextInt();
			total = total + nota;
			contador = contador + 1;
		}
		tamanho = total /10;
		
		System.out.printf("Total de todas as Notas %d \n ", total);
		System.out.printf("A Media da Classe e %d \n", tamanho);
		
		
		in.close();
	}
	

}
