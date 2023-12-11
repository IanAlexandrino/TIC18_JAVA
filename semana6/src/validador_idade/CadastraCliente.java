package validador_idade;

public class CadastraCliente {

	public static void main(String[] args) {
		
		ValidadorIdade validaIdade = new ValidadorIdade();
		
		
			try {
				validaIdade.validaIdade();
			} catch (IdadeInvalidaException e) {
				e.printStackTrace();
			}
	
	}

}
