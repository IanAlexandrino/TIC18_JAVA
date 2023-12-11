package caixa_eletronico;

public class ValorInvalidoException extends Exception{
	
	int valor;
	
	public ValorInvalidoException (int valor) {
		this.valor = valor;
	}
	
	public String getMessage() {
		return "Valor de " + valor + " inválido";
	}
}
