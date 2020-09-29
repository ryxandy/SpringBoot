package com.springmvc.ryxandy.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	
	//Aqui eu uso um ENUM de estados, está na classe UF, lá tem todos os campos acessados por aqui
	//Definindo o tamanho de caracteres que esse campo vai ter na tabela enderecos
	//Defino que esse enum no banco de dados vai ser do tipo String
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	
	@Column(nullable = false, length =9)
	private String CEP;
	
	
	@Column(nullable = false , length = 5)
	private Integer numero;
	
	
	private String complemento;

	
	//Aqui começa os getters e Setters

	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public UF getUf() {
		return uf;
	}


	public void setUf(UF uf) {
		this.uf = uf;
	}


	public String getCEP() {
		return CEP;
	}


	public void setCEP(String cEP) {
		CEP = cEP;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
	
	
	
}
