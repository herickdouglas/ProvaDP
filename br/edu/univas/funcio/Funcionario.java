package br.edu.univas.funcio;

import br.edu.univas.departamento.DepartamentoController;

public class Funcionario {
	private String registro;
	private String nome;
	private String email;
	departamento  Departamento;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
