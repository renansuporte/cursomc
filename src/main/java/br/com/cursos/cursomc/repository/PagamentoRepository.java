package br.com.cursos.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursos.cursomc.domain.Pagamento;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
