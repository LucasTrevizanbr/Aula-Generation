package com.games.jogosVideo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.jogosVideo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByMarcaContainingIgnoreCase(String marca);

}
