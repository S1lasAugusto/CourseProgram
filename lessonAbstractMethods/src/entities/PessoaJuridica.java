package entities;

public class PessoaJuridica extends Pessoa {

	private Integer funcionarios;

	public PessoaJuridica() {

		super();

	}

	public PessoaJuridica(String nome, double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override

	public double imposto() {

		double impostoBasico;

		if (getFuncionarios() < 10) {

			impostoBasico = getRendaAnual() * 0.16;

		} else {

			impostoBasico = getRendaAnual() * 0.14;

		}
		return impostoBasico;
	}

}
