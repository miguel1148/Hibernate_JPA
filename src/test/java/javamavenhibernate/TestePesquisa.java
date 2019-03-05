package javamavenhibernate;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TestePesquisa {
	
	@Test
	public void testepesquisar() {
		DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>(); 
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(5L);
		
		pessoa = dao.pesquisar(pessoa);
		System.out.println(pessoa.toString());
	}

}
