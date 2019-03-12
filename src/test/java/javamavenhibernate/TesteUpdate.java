package javamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteUpdate {

	@Test
	public void testePesquisar2() {
		
		DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>(); 
		UsuarioPessoa pessoa = dao.pesquisar(7L, UsuarioPessoa.class);
		
		pessoa.setIdade(24);
		pessoa.setNome("Adriana");
		pessoa.setSobrenome("Araujo");
		pessoa.setLogin("ADM");
		pessoa.setEmail("adrianaAraujo55@gmail.com");
		
		pessoa = dao.updateMerge(pessoa);
		System.out.println(pessoa.toString());
		
		
	}
}
