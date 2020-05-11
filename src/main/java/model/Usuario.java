package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id", nullable=false,unique=true) 
	private int id;
	
	
	@Column (name="nomeusuario", nullable=false, unique=true)
	private String nomeUsuario;
	
	@Column (name="senha", nullable=false, unique=true)
	private String senha;
	

	@Column (name="ultimoacesso",  unique=true)
	@Temporal(TemporalType.DATE)
	private Date ultimoAcesso;

	
	//Metodos Getters e Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
}
