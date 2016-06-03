package classes;

public class Registro{
	

	private Pessoa pessoa;
	private Problema problema;
	
	public Registro(Pessoa pessoa, Problema problema){
		super();
		this.setPessoa(pessoa);
		this.setProblema(problema);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	@Override
	public String toString() {
		return getPessoa() + "" + getProblema() + "\n";
	}

}
