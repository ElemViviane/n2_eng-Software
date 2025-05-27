package com.biblioteca.livros.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.livros.entitys.Livro;
import com.biblioteca.livros.services.ServiceLivro;

@RestController
@RequestMapping("api/livros")
@CrossOrigin("*")
public class ControllerLivro {
	
	@Autowired
	ServiceLivro livroService;
	
	@PostMapping("/cadastrar")
	public Livro salvarEmprestimo(@RequestBody Livro livro) {
		return livroService.salvarLivro(livro);
	}
	
	@PutMapping("/atualizarDados")
	public Livro atualizarLivro(@PathVariable Long id, @RequestBody 
			Livro livro) {
		return livroService.atualizarLivroPorId(id, livro);
	}
	
	@GetMapping("/buscarTodos")
	public List<Livro> buscarTodosLivros(){
		return livroService.listarTodosLivros();
	}
	
	@GetMapping("/{id}")
	public Livro buscarLivroPorId(@PathVariable Long id){
		return livroService.buscarLivroPorId(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarLivroPorId(@PathVariable Long id) {
		livroService.deletarLivroPorId(id);
	}
}
