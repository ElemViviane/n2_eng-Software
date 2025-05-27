package com.biblioteca.livros.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biblioteca.livros.entitys.Livro;
import com.biblioteca.livros.repositorys.RepositoryLivro;

@Service
public class ServiceLivro {
	
	@Autowired
	RepositoryLivro livroRepository;
	
	//getAll
		public List<Livro> listarTodosLivros(){
			return livroRepository.findAll();
		}
		
		//post
		public Livro salvarLivro(Livro livro) {
			return livroRepository.save(livro);
		}
		
		//delete
		public void deletarLivroPorId(Long id) {
			livroRepository.deleteById(id);
		}
		
		//get
		public Livro buscarLivroPorId(Long id) {
			return livroRepository.findById(id)
					.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
		}
		
		//put
		public Livro atualizarLivroPorId(Long id, Livro livro) {
			Livro livro1 = livroRepository.findById(id)
					.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
			
			livro1.setTitulo(livro.getTitulo());
			livro1.setAutor(livro.getAutor());
			livro1.setAnoPublicacao(livro.getAnoPublicacao());
			livro1.setEditora(livro.getEditora());
			
			return livroRepository.save(livro);
		}
}
