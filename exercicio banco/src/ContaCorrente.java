
public class ContaCorrente extends ContaBancaria {

	private int quantTransacoes;

	public ContaCorrente(String senha, int quantTransacoes) {
		super(senha);
		this.quantTransacoes = quantTransacoes;
	}

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tiraExtrato() {
		// TODO Auto-generated method stub

	}

}
