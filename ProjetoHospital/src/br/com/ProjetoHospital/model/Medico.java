package br.com.ProjetoHospital.model;

import java.util.Iterator;
import java.util.List;

public class Medico {
//atributos
	private int id;
	private String nome;
	private String especialidade;
	private boolean isPlantao;
	private List<Paciente> pacientes;
	
	//construtor
	public Medico () {
		
	}

	
	//metodos Set e Get
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean isPlantao() {
		return isPlantao;
	}

	public void setPlantao(boolean isPlantao) {
		this.isPlantao = isPlantao;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void CadastrarPaciente (Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("/nPaciente cadastrado com sucesso!");
	}
	
	public void imprimirRelatorioPacientes() {
		
		System.out.println("- Relatório de Pacientes: dr(a)" + this.nome + " -");
		
		for (Paciente paciente : this.pacientes) {
			paciente.exibirDadosPaciente();
			
		}
	}
	
	
}
