package com.fatec.produto.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.produto.model.Catalogo;
import com.fatec.produto.model.IImagemRepository;
import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repositoryP;
	@Autowired
	IImagemRepository repositoryI;

	@Override
	public List<Catalogo> consultaCatalogo() {
		Catalogo c=null; 
		List<Catalogo> Lista = new ArrayList<>();
		List<Produto> listaP = repositoryP.findAll();
		List<Imagem> listaI = repositoryI.findAll();
		for (Produto p : listaP) {
			 for (Imagem i : listaI) {
			 if (p.getId().equals(i.getId())) {
			 c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(),
			p.getCusto(),p.getQuantidadeNoEstoque(), i.getArquivo());
			 Lista.add(c);
			 }
			 }
			 }
			 return Lista;
	}

	@Override
	public List<Catalogo> consultaPorDescricao(String descricao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> consultarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> atualizar(Long id, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

}
