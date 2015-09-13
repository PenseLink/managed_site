package penselink.test;

import java.util.Date;
import java.util.List;

import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import penselink.model.eao.MarcaEao;
import penselink.model.eaoImpl.MarcaEaoImpl;
import penselink.model.entidades.Marca;
import penselink.service.MarcaService;
import penselink.serviceImpl.MarcaServiceImpl;


public class TestaMarca {
	
public static void main (String[] args){
	Date data = new Date();
	System.out.println(data);
	
	
	for(long i = 0;i<4;i++){
		for(long j = 0;j<1000000000;j++){
			
		}
	}
	
	System.out.println(data);
}
}
