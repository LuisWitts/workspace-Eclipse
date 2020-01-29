package br.org.generation.Vitrine.Virtual.services;

import java.util.List;

import br.org.generation.Vitrine.Virtual.model.Produto;

public interface IProdutoService {

	public List <Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
}
