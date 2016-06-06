import classes.Endereco;
import classes.Pessoa;
import classes.Problema;
import classes.Registro;
import persistencia.pRegistro;
import java.text.ParseException;

import javax.swing.JOptionPane;

public class MeuAmbiente {

	public static void main(String[] args) throws ParseException {
		int cadastrar = 0;
		int visualizarRegistros;
		pRegistro registros = new pRegistro(); //Instância da classe que armazena os registros

		while(cadastrar == 0){
			// Declaração de variáveis
			String mensagem1 = "Bem-vindo ao Projeto Meu Ambiente.";
			mensagem1 += "\n\n Clique em OK para informar um problema ambiental";
			String nome;
			String cpf = "";
			String cep;
			String descricao;
			String sugestao;
			Problema problema = new Problema(); 	//Instância do Problema

			JOptionPane.showMessageDialog(null, mensagem1); // Tela inicial
			
			//Coleta de dados
			nome 	  = JOptionPane.showInputDialog("Informe seu nome");
			cpf  	  = JOptionPane.showInputDialog("Informe seu CPF");
			cep  	  = JOptionPane.showInputDialog("Informe o CEP do local do problema a reportar");
			descricao = JOptionPane.showInputDialog("Conte-nos sobre o problema");

			Pessoa pessoa = new Pessoa(nome, cpf); 			//Instância da Pessoa
			Endereco enderecoProblema= new Endereco(cep);  //Instância de endereco
			
			problema.setEndereco(enderecoProblema);		 //  População do
			problema.setDescricao(descricao);			//   problema
			
			// Opção de sugestão do usuário
			int respostaSolucao = JOptionPane.showConfirmDialog(null, "Deseja propor uma solução?");
			if(respostaSolucao == 0){
				sugestao = JOptionPane.showInputDialog("Qual solução você sugere?");
				problema.setSugestaoMelhoria(sugestao);
			}
			
			
			Registro registro = new Registro(pessoa, problema);	//Instância do registro
			registros.setRegistro(registro); // População dos registros
			cadastrar = JOptionPane.showConfirmDialog(null, "Deseja informar um novo problema?");
		}
		
		// Opção de visualizar registros
		visualizarRegistros = JOptionPane.showConfirmDialog(null, "Deseja visualizar os registros?");
		if(visualizarRegistros == 0 ){
			JOptionPane.showMessageDialog(null, registros.toString());
		}else{
			JOptionPane.showMessageDialog(null, "Obrigado por utilizar o nosso sistema");
		}
	}
}
