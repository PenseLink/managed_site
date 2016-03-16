package penselink.apis;

public class TestaConcorrencia {
	public static void main(String[] args) {
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();		
		Thread t2 = new Thread(copiador);
		t2.start();
		
		
		BarraDeProgresso barra = new BarraDeProgresso();		
		Thread t1 = new Thread(barra);
		t1.start();
		

	}

}
