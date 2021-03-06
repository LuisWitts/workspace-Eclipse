package br.org.generation.Vitrine.Virtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.Vitrine.Virtual.dao.ProdutoRepo;
import br.org.generation.Vitrine.Virtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired                //declaramos a interface do DAO que criamos
	private ProdutoRepo repo; //busca inplementação
	
	
	@Override
	public List<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		
		//representa um inner join 
		//	select * from tblproduto 
		//		inner join tbldepartament
		//		on tblproduto.depto_id = departamento.id
		return (List<Produto>)repo.findAll();
	}

	@Override
	public Produto recuperarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
