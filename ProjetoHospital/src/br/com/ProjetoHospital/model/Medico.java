package br.com.ProjetoHospital.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medico {
//atributos
	private int id;
	private String nome;
	private String especialidade;
	private boolean isPlantao;
	private List<Paciente> pacientes;

	// construtor
	public Medico() {
		this.pacientes = new ArrayList<Paciente>();
	}

	// metodos Set e Get

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

	public void CadastrarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("\nPaciente cadastrado com sucesso!");
	}

	public void imprimirRelatorioPacientes(int tipoRelatorio) {

		if (this.pacientes.size() == 0) {
			System.out.println("Sem pacientes cadastrados. ");
		} else {

			// Tipos de relatorio
			// 1 imprimir todos
			// 2 imprimir internados
			// 3 imprimir nao internados

			switch (tipoRelatorio) {

			case 1:
				System.out.println("\n- Relatório de Pacientes: dr(a)" + this.nome + " -");

				for (Paciente paciente : this.pacientes) {
					paciente.exibirDadosPaciente();
				}
				break;
			case 2:
				System.out.println("\n- Relatório de Pacientes Internados: dr(a)" + this.nome + " -");
				for (Paciente paciente : this.pacientes) {
					if (paciente.isInternado() == true)
						paciente.exibirDadosPaciente();
				}

				break;
			case 3:
				System.out.println("\n- Relatório de Pacientes não Internados: dr(a)" + this.nome + " -");
				for (Paciente paciente : this.pacientes) {
					if (paciente.isInternado() == false)
						paciente.exibirDadosPaciente();
				}

				break;

			}

		}

	}

	public void realizarAltaPaciente(Paciente paciente) {

		if (paciente.isInternado() == true) {
			paciente.setIsInternado(false);
			System.out.println(paciente.getNome() + " está de alta!");

		} else {
			System.out.println("Paciente não internado");
		}

	}
	
	
	public void realizarAltaPaciente(int idPaciente) {
		Paciente pacienteAlta = null;
		for (Paciente paciente : this.pacientes) {
			if(paciente.getId() == idPaciente) {
				pacienteAlta = paciente;
			}
			
			if(pacienteAlta == null) {
				System.out.println("Paciente não encontrado para o id: " + idPaciente);
			}else {
				if (pacienteAlta.isInternado() == true){ 
					pacienteAlta.setIsInternado(false);
					System.out.println(paciente.getNome() + " está de alta!");
					
				}
			}
		}
	}
}

//melhorar o metodo para que seja possivel imprimir o relatorio de 3 formas, sendo:
// todos os pacientes
//somente os pacientes internados
//somente os opacientes não internados.

// inplementar o metodo "RealizarAltaPaciente"