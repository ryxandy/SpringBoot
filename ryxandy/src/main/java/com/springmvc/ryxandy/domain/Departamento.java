package com.springmvc.ryxandy.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

	//Apenas criar o nome pq o ID vai ser herdado da classe mãe abstrata, com ID auto incrementável
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	
	//MappedBy = diz qual o atributo do lado forte da relação la na classe cargo
	@OneToMany(mappedBy = "departamentos")
	private List<Cargo> cargos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
}
