package com.springmvc.ryxandy.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

	
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	
	//Aqui quer dizer que vai ter uma chave estrangeira e que ela é um para muitos, e faz um Join de departamento.
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	
	
	//Campo que define que um cargo pode ter vários funcionários
	@OneToMany(mappedBy = "cargo")
	private List<Funcionarios> funcionarios;
	
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Funcionarios> getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(List<Funcionarios> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
}
