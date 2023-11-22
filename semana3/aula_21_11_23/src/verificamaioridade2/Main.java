package verificamaioridade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MaiorIdade calculaIdade = new MaiorIdade();
        int _diaNasc, _mesNasc, _anoNasc, _diaAtual, _mesAtual, _anoAtual;

        System.out.println("Informe a sua data de nascimento: ");

        System.out.println("Dia: ");
        _diaNasc = entrada.nextInt();
        System.out.println("Mês: ");
        _mesNasc = entrada.nextInt();
        System.out.println("Ano: ");
        _anoNasc = entrada.nextInt();

        System.out.println("Agora informe a data atual: ");

        System.out.println("Dia: ");
        _diaAtual = entrada.nextInt();
        System.out.println("Mês: ");
        _mesAtual = entrada.nextInt();
        System.out.println("Ano: ");
        _anoAtual = entrada.nextInt();

        calculaIdade.calculaIdade(_diaNasc, _mesNasc, _anoNasc, _diaAtual, _mesAtual, _anoAtual);
    }
}
