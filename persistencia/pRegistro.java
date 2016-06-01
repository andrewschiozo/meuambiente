package persistencia;
import classes.Registro;
import interfaces.iPersistencia;

public class pRegistro implements iPersistencia{

	private Registro registro;
	
	public pRegistro(){}
		
	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

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
