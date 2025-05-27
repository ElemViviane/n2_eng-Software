package com.biblioteca.livros.entitys;

import java.util.Date;
import com.biblioteca.livros.enuns.StatusEmprestimo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Livro livro;
	
	@ManyToOne
	private Usuario usuario;
	
	@Column (nullable = false)
	private Date dataEmprestimo;
	
	@Column
	private Date dataDevolucao;
	
	@Column (nullable = false)
	private StatusEmprestimo status;
	
	public Emprestimo() {
		
	}
	
	public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo,
			StatusEmprestimo status) {
		this.usuario = usuario;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.status = status;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public StatusEmprestimo getStatus() {
		return status;
	}
	
	public void setStatus(StatusEmprestimo status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
}
