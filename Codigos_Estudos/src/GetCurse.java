import java.util.Scanner;

public class GetCurse {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		SetCurse curso = new SetCurse();
		
		// Aqui a variavel inicial como null por nao exigir
		// nada pra ser inicializado
		System.out.printf("Curso Inicial %s \n",curso.getnomeCurso());
		//adicionei o nome direto na variavel privada
		//e agora ela inicia com o nome direito.
		
		
		System.out.println("Qual o nome do Curso?");
		//aqui e pedido que o usuario digite o nome do curso.
		//para poder atribuir a variavel nome
		String nome = in.nextLine();
		curso.setnomeCurso(nome);
		System.out.println();
		
		//aqui a variavel ja foi alterada pelo valor digitado 
		//pelo usuario.
		System.out.printf("Curso Inicial %s \n",curso.getnomeCurso());
		
		//essa funcao chama a menssagem com o nome do curso
		// que o usuario digitou.
		curso.Menssagem();
		
		in.close();
	}

}
