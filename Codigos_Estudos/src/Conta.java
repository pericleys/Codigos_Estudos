
public class Conta {

	private double balanca;
	
		public Conta(double balancaInicial)
		{
		if(balancaInicial > 0.0)
			balanca = balancaInicial;
	}
		public void Credito(double dinheiro)
		{
			balanca = balanca + dinheiro;
		}
		public double getbalanca()
		{
			return balanca;
		}
}
		