package penselink.dao;

import java.io.Serializable;
import java.util.Collection;
/**
 * @author geovan
 * @param <T> tipo de entidade com qual  DAO vai trabalhar
 * */
public interface DAO<T> extends Serializable{
	
	/**
	 * Persiste o Objeto no banco de dados
	 * */
	void salvar(T entidade);
	
	/**
	 * Persiste uma lista de objetos no banco de dados
	 * */
	void salvar(Collection<T> entidades);
	
	/**
	 * Lista todos os registros de uma entidade
	 * */
	Collection<T> listarTodos();
	
	/**
	 * Lista os registros de uma entidade com paginação
	 * @param inicio
	 * @param fim
	 * */
	Collection<T> listarPaginacao(Integer inicio, Integer fim);
	
	/**
	 * Remove um item fisicamente do banco de dados
	 * @param entidade
	 * */
	void remocaoFisica(T entidade);
	
	/**
	 * Remoção lógica de um item
	 * @param entidade
	 * */
	void remocaoLogica(T entidade);
	
	/**
	 * Atualiza um objeto no banco de dados
	 * @param entidade
	 * */
	void atualizar(T entidade);
}
