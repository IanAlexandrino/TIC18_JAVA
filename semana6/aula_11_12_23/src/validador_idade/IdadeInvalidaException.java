package validador_idade;

public class IdadeInvalidaException extends Exception{
	
	int idade;
	
	public IdadeInvalidaException (int idade) {
		this.idade = idade;
	}
	
	public String getMessage() {
		return "Idade " + idade + " inválida";
	}
}
