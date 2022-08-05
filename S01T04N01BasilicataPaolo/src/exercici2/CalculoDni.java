package exercici2;

public class CalculoDni {

	private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public CalculoDni() {
		
		
	}
	
	public char CalcularLetra(String dni) {
		char letra = '\u0000';
		
		try {
			  int numeroDni = Integer.parseInt(dni);
			  int resta = numeroDni % 23;
			  letra = letras.charAt(resta);
			    
			}catch(NumberFormatException e) {
				
			}
		return letra;
		
	}
}
