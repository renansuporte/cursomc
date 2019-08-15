package br.com.cursos.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursos.cursomc.domain.Categoria;
import br.com.cursos.cursomc.domain.ItemPedido;
import br.com.cursos.cursomc.domain.ItemPedidoPK;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{

}
