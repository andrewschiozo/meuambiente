package classes;

public class Problema {
	
	private Endereco endereco;
	private String descricao;
	private String sugestaoMelhoria;
	
	public Problema(){}
	
	public Problema(Endereco cep, String descricao ){
		this.setEndereco(cep);
		this.setDescricao(descricao);
	}
	
	public Problema(Endereco cep, String descricao, String sugestaoMelhoria ){
		this.setEndereco(cep);
		this.setDescricao(descricao);
		this.setSugestaoMelhoria(sugestaoMelhoria);
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSugestaoMelhoria() {
		return sugestaoMelhoria;
	}

	public void setSugestaoMelhoria(String sugestaoMelhoria) {
		this.sugestaoMelhoria = sugestaoMelhoria;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Dados do Problema: " + getEndereco() + "\nDescrição: " + getDescricao() + "\nProposta de melhoria: "
				+ getSugestaoMelhoria() + "\n";
	}


	
}
