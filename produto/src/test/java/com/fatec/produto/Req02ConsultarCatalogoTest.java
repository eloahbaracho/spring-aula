package com.fatec.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.produto.model.Catalogo;
import com.fatec.produto.model.Produto;
import com.fatec.produto.servico.IProdutoServico;
@SpringBootTest
class Req02ConsultarCatalogoTest {
	@Autowired
	IProdutoServico produtoServico;
	@Test
	void test() {
		List<Catalogo> produtos = produtoServico.consultaCatalogo();
		assertEquals(1,produtos.size());
	}

}
