package classes;

public class Problema {
	
	private int id;
	private String descricao;
	private String sugestaoMelhoria;
	
	public Problema(String descricao ){
		this.setDescricao(descricao);
	}
	
	public Problema(String descricao, String sugestaoMelhoria ){
		this.setDescricao(descricao);
		this.setSugestaoMelhoria(sugestaoMelhoria);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Problema [\n\tId: " + getId() + "\n\tDescrição: " + getDescricao() + "\n\tProposta de melhoria: "
				+ getSugestaoMelhoria() + "\n\t]";
	}
	
}
