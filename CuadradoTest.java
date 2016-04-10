package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CuadradoTest {

	@Test
	public void testQueCalculaElPerimetroDelCuadrado() {
		Cuadrado miCuadrado = new Cuadrado();
		Double resultadoEsperado = 16.0;
		Double resultadoObtenido = miCuadrado.hallarPerimetroDelCuadrado(4.0);
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	@Test
	public void testQueCalculaElAreaDelCuadrado() {
		Cuadrado miCuadrado = new Cuadrado();
		Double resultadoEsperado = 4.0;
		Double resultadoObtenido = miCuadrado.hallarAreaDelCuadrado(2.0);
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}
