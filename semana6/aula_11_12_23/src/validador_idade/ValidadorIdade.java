package validador_idade;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ValidadorIdade {
	
	private Calendar cal;
	private int dia;
	private int mes;
	private int ano;
	private int idade;
	
	public ValidadorIdade() {
		cal = GregorianCalendar.getInstance();	
		}
	
	public int validaIdade() throws IdadeInvalidaException {
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Digite o dia que vc nasceu: ");
		dia = entrada.nextInt();
		
		System.out.println("Digite o mês que vc nasceu: ");
		mes = entrada.nextInt();
		
		System.out.println("Digite o ano que vc nasceu: ");
		ano = entrada.nextInt();
		
		
		idade = cal.get(Calendar.YEAR) - ano;
		
		if(idade <= 0 || idade > 150) {
			throw new IdadeInvalidaException(idade);
		} else {
			return idade;
		}
		
		
	}
}
