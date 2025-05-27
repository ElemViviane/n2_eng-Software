package com.biblioteca.livros.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.biblioteca.livros.entitys.Emprestimo;
import com.biblioteca.livros.enuns.StatusEmprestimo;
import com.biblioteca.livros.repositorys.RepositoryEmprestimo;

@Service
public class ServiceEmprestimo {
	
	@Autowired
	RepositoryEmprestimo emprestimoRepository;
	
	//getAll
	public List<Emprestimo> listarTodosEmprestimos(){
		return emprestimoRepository.findAll();
	}
	
	//post
	public Emprestimo salvarEmprestimo(Emprestimo emprestimo) {
		return emprestimoRepository.save(emprestimo);
	}
	
	//delete
	public void deletarEmprestimoPorId(Long id) {
		emprestimoRepository.deleteById(id);
	}
	
	//get
	public Emprestimo buscarEmprestimoPorId(Long id) {
		return emprestimoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
	}
	
	//put
	public Emprestimo atualizarEmprestimoPorId(Long id, Emprestimo emprestimo) {
		Emprestimo emprestimo1 = emprestimoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
		
		emprestimo1.setDataEmprestimo(emprestimo.getDataEmprestimo());
		emprestimo1.setLivro(emprestimo.getLivro());
		emprestimo1.setUsuario(emprestimo.getUsuario());
		emprestimo1.setStatus(emprestimo.getStatus());
		emprestimo1.setDataDevolucao(emprestimo.getDataDevolucao());
		
		return emprestimoRepository.save(emprestimo);
	}
	
//	//put
//	public Emprestimo devolverLivro(@PathVariable Long id) {
//	        Emprestimo emprestimo1 = emprestimoRepository.findById(id)
//	                .orElseThrow(() -> new IllegalArgumentException("Empréstimo não encontrado"));
//	        if(){
//	        	
//	        }
//	}
}
