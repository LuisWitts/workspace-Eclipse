package br.org.generation.Vitrine.Virtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.Vitrine.Virtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
// aqui pode vir outros metodos
}
