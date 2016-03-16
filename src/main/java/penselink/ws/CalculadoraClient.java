package penselink.ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraClient {
	public static void main(String[] args)throws Exception{
		URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
		QName qName = new QName("http://ws.penselink/","CalculatorIMPLService");
		Service service = Service.create(url,qName);
		Calculator calculator = service.getPort(Calculator.class);
		
		System.out.println("Soma (5+1): "+calculator.soma(5, 1));
		System.out.println("Subtração (12-7:) "+calculator.subtracao(12, 7));
	}
}
