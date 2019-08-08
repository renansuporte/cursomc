package br.com.cursos.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursos.cursomc.domain.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
