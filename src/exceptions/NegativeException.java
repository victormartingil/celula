package exceptions;

public class NegativeException extends Exception{
	
	public NegativeException () {
		super("El número debe ser positivo");
	}
}
