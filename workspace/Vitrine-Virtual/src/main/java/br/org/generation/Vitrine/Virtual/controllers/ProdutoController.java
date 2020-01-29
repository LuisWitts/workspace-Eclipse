package br.org.generation.Vitrine.Virtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.Vitrine.Virtual.model.Produto;
import br.org.generation.Vitrine.Virtual.services.IProdutoService;

@RestController
@CrossOrigin("*")

public class ProdutoController {

	@Autowired
	private IProdutoService serviço; // declaramos sempre a interface
	
	@GetMapping("/produto/")
	public ResponseEntity<List<Produto>>mostrarTodos(){
		return ResponseEntity.ok(serviço.recuperarTodos());
	}
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> mostraPeloId(@PathVariable int id){
		Produto p = serviço.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
}
