package penselink.daoIMPL;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import penselink.dao.TipoDAO;
import penselink.model.entidades.Tipo;

@Repository
@Transactional
public class TipoDAOIMPL extends DAOIMPL<Tipo> implements TipoDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5550270128089448191L;

}
