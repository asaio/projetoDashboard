package com.example.projeto.model;

import javax.persistence.*;
@Entity
@Table(name="tbl_usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="idusuario")
	private int id;
	
	@Column(name="nome",length=100,nullable=false)
	private String nome;
	
	@Column(name="email",length=100,nullable=false)
	private String email;
	
	@Column(name="racf",length=7,nullable=false,unique=true)
	private String racf;
	
	@Column(name="senha",length=30)
	private String senha;
	
	@Column(name="setor",length=100,nullable=false)
	private String setor;
	
	@Column(name="linkFoto",length=30,nullable=false)
	private String linkFoto;

	public int getId() {
		return id;
	}

	public void setId(int idusuario) {
		this.id = idusuario;
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

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
}
