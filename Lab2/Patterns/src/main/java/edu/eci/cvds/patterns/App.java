package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String answ = "Hello ";
	if(args.length != 0){
		answ+=args[0];
		
	}else{
		answ+="World";
	}

        System.out.println(answ+"!");
	      }
}
