package javamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
//		HibernateUtil.getEntityManager(); Criar tabela		
//		DaoGeneric<?> dao = new DaoGeneric();
		
		DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setEmail("andreza_lima@gmail.com");
		pessoa.setLogin("teste2");
		pessoa.setNome("Andreza");
		pessoa.setSobrenome("Lima");
		pessoa.setSenha("987654321");
		pessoa.setIdade(27);
		
		dao.salvar(pessoa);
		

		
	}

}
