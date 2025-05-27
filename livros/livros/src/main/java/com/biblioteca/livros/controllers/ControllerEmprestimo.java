package com.biblioteca.livros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.livros.entitys.Emprestimo;
import com.biblioteca.livros.services.ServiceEmprestimo;

@RestController
@RequestMapping("api/emprestimos")
public class ControllerEmprestimo {
	
	@Autowired
	ServiceEmprestimo emprestimoService;
	
	@PostMapping("/cadastrar")
	public Emprestimo salvarEmprestimo(@RequestBody Emprestimo emprestimo) {
		return emprestimoService.salvarEmprestimo(emprestimo);
	}
	
	@PutMapping("/atualizarDados")
	public Emprestimo atualizarEmprestimo(@PathVariable Long id, @RequestBody 
			Emprestimo emprestimo) {
		return emprestimoService.atualizarEmprestimoPorId(id, emprestimo);
	}
	
	@GetMapping("/buscarTodos")
	public List<Emprestimo> buscarTodosEmprestimos(){
		return emprestimoService.listarTodosEmprestimos();
	}
	
	@GetMapping("/{id}")
	public Emprestimo buscarEmprestimoPorId(@PathVariable Long id){
		return emprestimoService.buscarEmprestimoPorId(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarEmprestimoPorId(@PathVariable Long id) {
		emprestimoService.deletarEmprestimoPorId(id);
	}
}
