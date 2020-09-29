package com.springmvc.ryxandy.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionarios extends AbstractEntity<Long> {

	
	@Column(nullable = false, unique = true)
	private String nome;
	
	
	
	//Defino que ele vai ser um campo decimal com tamanho de 7 digitos e 2 casa depois da virgulo, e qnd não tiver
	//nada ao invés de aparecer null, vai ser 0,00 através do campo default
	@Column(nullable = false, columnDefinition = "DECIMAL(7.2) DEFAULT 0.00")
	private BigDecimal salario;
	
	
	@Column(name =" data_entrada", nullable = false,columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name =" data_saida", nullable = true, columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	
	//Cascade quer dizer que vai vincular esse campo ao registro, quando apagar um funcionario o endereço vai junto
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;
	
	
	//Muitos funcionários vão ter um cargo
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}


	public LocalDate getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public LocalDate getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
	
	
	
	
}
