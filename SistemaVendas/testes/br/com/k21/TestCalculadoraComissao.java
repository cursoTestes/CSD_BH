package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void paraVendaDe1000_Retorna_50() {
		double valorVenda = 1000;
		double esperado = 50 ;
		CalculadoraComissao calculadora = new CalculadoraComissao();
		double retorno = calculadora.CalculaComissao(valorVenda);
		assertEquals(esperado, retorno,0);
	}
	
	@Test
	public void paraVenda20000_Retorna_1200(){
		double valorVenda = 20000;
		double esperado = 1200;
		
		CalculadoraComissao calculadora = new CalculadoraComissao();
		double retorno = calculadora.CalculaComissao(valorVenda);
		
		assertEquals(esperado, retorno,0);
	}
	
	@Test
	public void paraVendaDe10000_Retorna_500(){

		double valorVenda = 10000;
		double esperado = 500;
		
		CalculadoraComissao calculadora = new CalculadoraComissao();
		double retorno = calculadora.CalculaComissao(valorVenda);
		
		assertEquals(esperado, retorno,0);
	}
	@Test
	public void paraVendaDe500reais80centavos_Retorna_25reais04centavos(){

		double valorVenda = 500.80;
		double esperado = 25.04;
		
		CalculadoraComissao calculadora = new CalculadoraComissao();
		double retorno = calculadora.CalculaComissao(valorVenda);
		
		assertEquals(esperado, retorno,0.001);
	}
	
}
