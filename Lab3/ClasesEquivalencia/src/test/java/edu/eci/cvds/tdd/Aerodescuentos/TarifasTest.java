package edu.eci.cvds.tdd.Aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;


public class TarifasTest {
	private double valor;
	@Test
	public void validatedescuento() {
		/* estos casos no lanza excepcion si no que los toma como menores de edad o antelacion menor a 20
		//caso si la antelacion es un numero invalido deberia lanzar excepcion
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,-19,18);
			Assert.assertTrue(false);
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		//caso si la edad es un numero invalido deberia lanzar excepcion
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,19,-20);
			Assert.assertTrue(false);
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		//caso si la edad es un numero invalido deberia lanzar excepcion
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,19,-1);
			Assert.assertTrue(false);
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		*/
		//0 años deberia ser menor de edad, descuento del 5%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,0);
		Assert.assertTrue(valor==475);
		
		//1 año deberia ser menor de edad, descuento del 5%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,1);
		Assert.assertTrue(valor==475);
		
		//10 año deberia ser menor de edad, descuento del 5%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,10);
		Assert.assertTrue(valor==475);
		
		//17 años deberia ser menor de edad, descuento del 5%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,17);
		Assert.assertTrue(valor==475);
		
		//18 años deberia ser mayorde edad, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,18);
		Assert.assertTrue(valor==500);
		
		//19 año deberia ser mayor de edad, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,19);
		Assert.assertTrue(valor==500);
		
		//40 año deberia ser mayor de edad, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,40);
		Assert.assertTrue(valor==500);
		
		//65 año deberia ser menor de edad, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,65);
		Assert.assertTrue(valor==500);

		//66 año deberia ser menor de edad, descuento del 8%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,66);
		Assert.assertTrue(valor==460);
		
		//100 año deberia ser menor de edad, descuento del 8%
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,100);
		Assert.assertTrue(valor==460);
		
		//Antelacion 20 dias, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,20,20);
		Assert.assertTrue(valor==500);
		
		//Antelacion 1 dias, descuento del 0%
		valor=CalculadorDescuentos.calculoTarifa(500.0,1,20);
		Assert.assertTrue(valor==500);
		
		//Antelacion 21 dias, descuento del 15%
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,20);
		Assert.assertTrue(valor==425);
		
		//Antelacion 40 dias, descuento del 15%
		valor=CalculadorDescuentos.calculoTarifa(500.0,40,20);
		Assert.assertTrue(valor==425);
		
		//Antelacion 21 dias y menor de edad, descuento del 20%
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,1);
		Assert.assertTrue(valor==400);
		
		//Antelacion 21 dias y muy mayor de edad, descuento del 23%
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,100);
		Assert.assertTrue(valor==385);
		}
	}
