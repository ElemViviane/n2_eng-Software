package com.biblioteca.livros.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.biblioteca.livros.entitys.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{

}
