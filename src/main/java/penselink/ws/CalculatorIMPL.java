package penselink.ws;

import javax.jws.WebService;

@WebService (endpointInterface = "penselink.ws.Calculator")
public class CalculatorIMPL implements Calculator{

	@Override
	public float soma(float num1, float num2) {
		return num1+num2;
	}

	@Override
	public float subtracao(float num1, float num2) {
		return num1-num2;
	}

	@Override
	public float multiplicacao(float num1, float num2) {
		return num1*num2;
	}

	@Override
	public float divisao(float num1, float num2) {
		return num1/num2;
	}
}
