package com.biblioteca.livros.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biblioteca.livros.entitys.Usuario;
import com.biblioteca.livros.repositorys.RepositoryUsuario;

@Service
public class ServiceUsuario {
	
	@Autowired
	RepositoryUsuario usuarioRepository;

	//getAll
	public List<Usuario> listarTodosUsuarios(){
		return usuarioRepository.findAll();
	}
	
	//post
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
		
	//delete
	public void deletarUsuarioPorId(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	//get
	public Usuario buscarUsuarioPorId(Long id) {
		return usuarioRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
	}
	
	//put
	public Usuario atualizarUsuarioPorId(Long id, Usuario usuario) {
		Usuario usuario1 = usuarioRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Consulta não encontrado com o ID: " + id));
		
		usuario1.setNome(usuario.getNome());
		usuario1.setCurso(usuario.getCurso());
		usuario1.setMatricula(usuario.getMatricula());
		
		return usuarioRepository.save(usuario);
	}

}
