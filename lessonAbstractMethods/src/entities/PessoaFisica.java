package entities;

public class PessoaFisica extends Pessoa {

	private double gastoSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override

	public double imposto() {

		double impostoBasico;

		if (getRendaAnual() < 20000.0) {

			impostoBasico = (getRendaAnual() * 0.15) - (gastoSaude * 0.50);

		} else {

			impostoBasico = (getRendaAnual() * 0.25) - (gastoSaude * 0.50);
		}
		if (impostoBasico < 0) {
			return 0;
		} else {
			return impostoBasico;

		}

	}

}
