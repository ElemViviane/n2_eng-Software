package com.biblioteca.livros.repositorys;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.biblioteca.livros.entitys.Emprestimo;

@Repository
public interface RepositoryEmprestimo extends JpaRepository<Emprestimo, Long>{
	List<Emprestimo> findByEmprestimosId(Long id);
}
