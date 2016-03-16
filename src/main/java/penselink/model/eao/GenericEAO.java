package penselink.model.eao;

import java.io.Serializable;
import java.util.List;

public interface GenericEAO <T,PK extends Serializable>{
	T create(T t);
	T read(PK id);
	T update(T t);
	void delete(T t);
	List<T> findAll();
}
