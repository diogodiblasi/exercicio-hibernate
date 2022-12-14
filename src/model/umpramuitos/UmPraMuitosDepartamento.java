package model.umpramuitos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class UmPraMuitosDepartamento {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	public UmPraMuitosDepartamento() {
	}

	public UmPraMuitosDepartamento(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
