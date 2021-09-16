import javax.swing.JOptionPane;

public class DialogoInteracao {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String menssagem = String.format("Bem vindo %s",nome);
		
		JOptionPane.showMessageDialog(null, menssagem);
	}
	
}
