package com.biblioteca.livros.entitys;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column (nullable = false)
	private String titulo;
	
	@Column (nullable = false)
	private String autor;
	
	@Column (nullable = false)
	private String editora;
	
	@Column (nullable = false)
	private Date anoPublicacao;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, String editora, Date anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public Date getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public Long getId() {
		return id;
	}
}
