package br.com.ProjetoHospital;

import java.util.Set;

import br.com.ProjetoHospital.model.Medico;
import br.com.ProjetoHospital.model.Paciente;

public class Main {

	public static void main(String[] args) {
		
	// Instaciar 3 objetors da classe Paciente
		Paciente Pac1 = new Paciente();
		Pac1.setId(1);
		Pac1.setNome("Jaíne Rosa");
		Pac1.setIsInternado(false);
		Pac1.setIdade(28);
		Pac1.setSexo("Feminino");
		
		Paciente Pac2 = new Paciente(2, "Laura", 04, "Feminino");
		Pac2.setIsInternado(true);
		
		Paciente Pac3= new Paciente(3 , "Joana", 30, "Feminino");
		Pac3.setIsInternado(false);
		// utilizado para mostrar os dados do paciente
//		Pac1.exibirDadosPaciente();
//		Pac2.exibirDadosPaciente();
//		Pac3.exibirDadosPaciente();
//		
		
		//instaciar 1 objeto da classe medico
		
		Medico medica = new Medico();
		medica.setId(1);
		medica.setNome("Ada	 Lovelace");
		medica.setPlantao(true);
		
		//mostrar pacientes cadastrados para o medico
		medica.CadastrarPaciente(Pac3);
		medica.CadastrarPaciente(Pac2);
		medica.CadastrarPaciente(Pac1);
		
		//mostrar relatorio de  paciente para determinado medico
		medica.imprimirRelatorioPacientes(3);
		
	
		
		// implementar "RealizarAltaPaciente"
		
		
		medica.realizarAltaPaciente(Pac1);
		
		
		
		
		
	}
	
	

}
