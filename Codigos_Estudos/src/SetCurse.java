
public class SetCurse {

	private String nomeCurso = "direito";
	
	public void setnomeCurso(String nome) {
		nomeCurso = nome;
	}
	public String getnomeCurso() {
		return nomeCurso;
	}
	public void Menssagem() {
		System.out.printf("bem vindo %s",getnomeCurso());
	}
}
