package br.com.ProjetoHospital.model;

public class Paciente {

	// Atributos

	private int id;
	private String nome;
	private int idade;
	private String sexo;
	private boolean isInternado;

	// Construtor Vazio

	public Paciente() {

	};

	// construtor com parametros.

	public Paciente(int id, String nome, int idade, String sexo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.isInternado = false;

	};

	// Get

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getSexo() {
		return this.sexo;
	}

	public boolean isInternado() {
		return this.isInternado;
	}

	// Set

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIsInternado(boolean isInternado) {
		this.isInternado = isInternado;
	}

	public void exibirDadosPaciente() {
		System.out.println("--------------------------------------------");
		System.out.println("Codigo: " + this.id + " Paciente: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos.");
		
		if (this.idade >= 60) {
			System.out.println("Paciente tem direito a acompanhante!");
		} else {
			System.out.println("Paciente não tem direito a acompanhante!");
		}
		System.out.println("--------------------------------------------");

	}


}
