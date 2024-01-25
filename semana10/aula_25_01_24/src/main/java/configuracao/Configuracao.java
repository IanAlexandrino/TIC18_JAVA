package configuracao;

import java.util.ArrayList;
import java.util.Scanner;

public class Configuracao {

    private String nome;
    private ArrayList<String> alfabeto;
    private int tamanhoSenha;
    private int maxTentativas;

    public Configuracao(){

        alfabeto = new ArrayList<>();

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void definirAlfabeto(int auxTamanhoAlfabeto){

        Scanner entrada = new Scanner(System.in);
        int i = 0;
        String auxLetra;

        while (i < auxTamanhoAlfabeto){

            i++;
            System.out.println("Digite uma letra: ");
            auxLetra = entrada.nextLine();
            alfabeto.add(auxLetra);
        }


    }


}
