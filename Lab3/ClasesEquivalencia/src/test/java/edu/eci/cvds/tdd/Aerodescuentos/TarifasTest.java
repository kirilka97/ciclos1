package edu.eci.cvds.tdd.Aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;


public class TarifasTest {
	private double valor;
	@Test
	public void antelacionInvalidaNegativa() {
		boolean b = false;
		
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,-19,18);
			Assert.assertTrue(true);
			
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	
	@Test
	public void edadInvalidaNegativa() {
		boolean b = false;
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,19,-20);
		}
		catch(Exception e) {
			b = true;
			Assert.assertTrue(b);
		}		
	}
	
	@Test
	public void edadInvalidaNegativaDos() {
		boolean b = false;
		try {
			valor=CalculadorDescuentos.calculoTarifa(500.0,19,-1);
		}
		catch(Exception e) {
			b = true;
			Assert.assertTrue(b);
		}
	}
	
	@Test
	public void menorDeEdadDescuentoCincoPorCiento() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,0);
		Assert.assertTrue(valor==475);
	}
	
	@Test
	public void menorDeEdadDescuentoCincoPorcientoDos() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,1);
		Assert.assertTrue(valor==475);
	}
	
	@Test
	public void menorDeEdadDescuentoCincoPorcientoTres() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,10);
		Assert.assertTrue(valor==475);
				
				
	}
	
	
	@Test
	public void menorDeEdadEnElLimiteDescuentoCincoPorcientoCuatro() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,17);
		Assert.assertTrue(valor==475);
	}
	
	@Test
	public void sinDescuentoUno() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,18);
		Assert.assertTrue(valor==500);		
	}
	
	@Test
	public void sinDescuentoDos() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,19);
		Assert.assertTrue(valor==500);
	}
	
	@Test
	public void sinDescuentoTres() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,40);
		Assert.assertTrue(valor==500);		
	}
	
	@Test
	public void sinDescientoPorEdad() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,65);
		Assert.assertTrue(valor==500);		
	}
	
	
	@Test
	public void edadSuperiorDescuentoDelOcho() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,66);
		Assert.assertTrue(valor==460);	
	}
	
	@Test
	public void edadSuperiorDescuentoDelOchoo() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,19,100);
		Assert.assertTrue(valor==460);
	}
	
	@Test
	public void antelacionEnElLimiteSinDescuento() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,20,20);
		Assert.assertTrue(valor==500);	
	}
	
	@Test
	public void antelacionMenorAVeinteSinDescuento() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,1,20);
		Assert.assertTrue(valor==500);
	}
	
	@Test
	public void antelacionMayorAVeinteDescuentoDelQuince() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,20);
		Assert.assertTrue(valor==425);	
	}
	
	
	@Test
	public void antelacionMayorAVeinteTieneDescuentoDelQuince() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,40,20);
		Assert.assertTrue(valor==425);
	}
	
	@Test
	public void antelacionMayorAVeinteYMenorDeEdadDescuentoDelVeinte(){
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,1);
		Assert.assertTrue(valor==400);		
	}
	
	@Test
	public void antelacionMayorAVeinteYAdultoMayorDescuentoDelVeinteyTres() {
		valor=CalculadorDescuentos.calculoTarifa(500.0,21,100);
		Assert.assertTrue(valor==385);	
	}
	
	
}
