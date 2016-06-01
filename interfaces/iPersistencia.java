package interfaces;

abstract public interface iPersistencia {
	
	abstract public boolean salvar();
	
	abstract public String ler();
	
	abstract public boolean editar();
	
	abstract public boolean apagar();
	
}
