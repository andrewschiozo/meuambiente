package classes;

public class Registro{
	
	private int id;
	private Pessoa pessoa;
	private Problema problema;
	
	public Registro(Pessoa pessoa, Problema problema){
		super();
		this.setPessoa(pessoa);
		this.setProblema(problema);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Registro [\n\tId: " + getId() + "\n \t" + getPessoa() + "\n \t" + getProblema()
				+ "\n]\n--------------------\n\n";
	}

}
