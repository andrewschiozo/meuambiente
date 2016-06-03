package persistencia;
import java.util.ArrayList;

import classes.Registro;
import interfaces.iPersistencia;

public class pRegistro implements iPersistencia{
	private ArrayList<Registro> lista = new ArrayList<Registro>();
	
	public pRegistro(){}
	
	public Object getRegistro(int id) {
		return lista.get(id);
	}

	public void setRegistro(Registro registro) {
		this.lista.add(registro);
	}

	@Override
	public boolean salvar() {
		System.out.println("Registro salvo com sucesso");
		return true;
	}
	
	@Override
	public Object ler(int id) {
		// TODO Auto-generated method stub
		return this.getRegistro(id);
	}

	@Override
	public String toString() {
		String retorno = "";
		for(int i = 0;i<lista.size();i++){  //enquanto i for menor, não maior 
			retorno += "Registro " + i + "\n";
			retorno += "---------------------------\n";
			retorno += lista.get(i); 
			retorno += "---------------------------\n";
		}
		return retorno;
	}

}
