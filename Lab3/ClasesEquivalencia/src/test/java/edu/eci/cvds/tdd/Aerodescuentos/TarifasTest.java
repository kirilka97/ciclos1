package edu.eci.cvds.tdd.Aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;


public class TarifasTest {
	
	//private Double valor;
	
	@Test
	public void validatedescuento() {
		try {
			CalculadorDescuentos.calculoTarifa(500,10,-1);
			Assert.assertTrue(false);
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		}
	}
