package exceptions;

public class NegativeException extends Exception{
	
	public NegativeException () {
		super("El n�mero debe ser positivo");
	}
}
