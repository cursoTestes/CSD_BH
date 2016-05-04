package br.com.k21;

public class CalculadoraComissao {

	private static final int VALOR_LIMITE_FAIXA_1 = 10000;
	private static final double PERCENTUAL_FAIXA_1 = 0.05;
	private static final double PERCENTUAL_FAIXA_2 = 0.06;

	public double CalculaComissao(double valorVenda) {
		
		if (valorVenda > VALOR_LIMITE_FAIXA_1)
			return valorVenda * PERCENTUAL_FAIXA_2;
		else
			return valorVenda * PERCENTUAL_FAIXA_1;
		
	}

}
