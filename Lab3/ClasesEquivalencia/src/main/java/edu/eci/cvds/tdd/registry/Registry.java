package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
		if(p.getAge()>=0){
			if (p.isAlive()){
				if(p.getAge()<18){
					return RegisterResult.UNDERAGE;
				}
			}
			else{
				return RegisterResult.DEAD;
			}
		}
		else{
			return RegisterResult.INVALID_AGE;
		}
		return RegisterResult.VALID;
        // TODO Validate person and return real result.
    }
}