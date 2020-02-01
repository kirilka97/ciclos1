package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

/*
Casos de equivalencia
Datos negativos (x<0) return INVALID_AGE
Menores de edad (x<18 and x>=0 and isAlive) return UNDERAGE
Posibles votantes (x>=18 and isAlive) return VALID
Muertos (not isAlive) return DEAD

*/
public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Daniel",159561,20,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
		//Caso Datos negativos
		person.setAge(-1);
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
		person.setAge(-20);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
		
		//Caso menor de edad

		person.setAge(0);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
		person.setAge(12);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
		
		person.setAge(17);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
		
		//Caso muerto

		person.setAlive(false);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
		
		//Caso posible votante
		
		person.setAlive(true);
		person.setAge(18);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
		
		person.setAlive(true);
		person.setAge(50);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
		
		person.setAge(90);
		
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO Complete with more test cases
}