package br.com.cursos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.cursomc.domain.Categoria;
import br.com.cursos.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository; 
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> optional = repository.findById(id);
		return optional.orElse(null);
	}
}
