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
import com.biblioteca.livros.entitys.Usuario;
import com.biblioteca.livros.services.ServiceUsuario;

@RestController
@RequestMapping("api/usuarios")
public class ControllerUsuario {
	
	@Autowired
	ServiceUsuario usuarioService;
	
	@PostMapping("/cadastrar")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvarUsuario(usuario);
	}
	
	@PutMapping("/atualizarDados")
	public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody 
			Usuario usuario) {
		return usuarioService.atualizarUsuarioPorId(id, usuario);
	}
	
	@GetMapping("/buscarTodos")
	public List<Usuario> buscarTodosUsuarios(){
		return usuarioService.listarTodosUsuarios();
	}
	
	@GetMapping("/{id}")
	public Usuario buscarUsuarioPorId(@PathVariable Long id){
		return usuarioService.buscarUsuarioPorId(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarUsuarioPorId(@PathVariable Long id) {
		usuarioService.deletarUsuarioPorId(id);
	}
}
