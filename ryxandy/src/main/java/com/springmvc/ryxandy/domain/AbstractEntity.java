package com.springmvc.ryxandy.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Adicionando um campo que se auto incrementa no MYSQL
	private ID id;

	//Getters e Setters do ID
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	
	//Equals e HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id =" + id;
	}

	//E por fim o ToString
	
	

}
