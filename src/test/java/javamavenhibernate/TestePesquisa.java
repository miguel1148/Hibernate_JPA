package javamavenhibernate;

import org.junit.Test;


import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TestePesquisa {
	
	/*
	@Test
	public void testepesquisar() {
		DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>(); 
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(5L);
		
		pessoa = dao.pesquisar(pessoa);
		System.out.println(pessoa.toString());
	}
	*/
	@Test
	public void testePesquisar2() {
		
		DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>(); 
		UsuarioPessoa pessoa = dao.pesquisar(7L, UsuarioPessoa.class);
		System.out.println(pessoa.toString());
		
		
	}

}
