package classes;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
			try {
				this.setDia(dia);
				this.setMes(mes);
				this.setAno(ano);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws Exception {
		if(dia > 0 && dia < 32){
			this.dia = dia;
		} else {
			throw new Exception("Dia inválido, entre com um número entre 1 e 31");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws Exception {
		if(mes > 0 && mes < 13){
			this.mes = mes;
		} else {
			throw new Exception("Mês inválido, entre com um número entre 1 e 12");
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws Exception{
		if(ano > 1885 && ano < 2003){
			this.ano = ano;
		} else {
			throw new Exception("Ano inválido. Entre com um número entre 1886 e 2002");
		}
	}

	public String toString(){
		String data = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
		return data;
	}
}
