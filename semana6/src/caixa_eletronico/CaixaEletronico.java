package caixa_eletronico;

import validador_idade.IdadeInvalidaException;
import java.util.Scanner;

public class CaixaEletronico {
	
	private int valor;
	private int saque;
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	public void sacar(int _saque) throws ValorInvalidoException {
		
		this.saque = _saque;
		
		while(valor > 10) {
			
			if(saque % 10 == 0 && saque < valor) {
				valor = valor - saque;
			}else{
				throw new ValorInvalidoException(saque);
			}
		}	
	}
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int saque;
		
		System.out.println("Digite  valor que você quer sacar: ");
		saque = entrada.nextInt();
		
		try {
			caixaEletronico.sacar(saque);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}

	}
	
}
