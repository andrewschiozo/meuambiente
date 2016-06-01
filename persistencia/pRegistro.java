package persistencia;
import classes.Registro;
import interfaces.iPersistencia;

public class pRegistro implements iPersistencia{

	private Registro registro;
	
	public pRegistro(){}
	
	
	
	@Override
	public boolean salvar() {
		System.out.println("Registro salvo com sucesso");
		return true;
	}

	@Override
	public String ler(int id) {
		
		return "";
	}

	@Override
	public boolean editar() {

		return true;
	}

	@Override
	public boolean apagar(int id) {

		return true;
	}

}
