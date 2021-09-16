import java.util.Scanner;

public class Curso {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		CursoNome curso = new CursoNome();
		
		System.out.println("Digite o nome do Curso");
		String nomeCurso = in.nextLine();
		System.out.println();
		
		curso.Menssagem(nomeCurso);
		
		in.close();
	}
}
