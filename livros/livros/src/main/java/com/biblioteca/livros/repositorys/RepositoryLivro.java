package com.biblioteca.livros.repositorys;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.biblioteca.livros.entitys.Livro;

@Repository
public interface RepositoryLivro extends JpaRepository<Livro, Long>{
	
}
