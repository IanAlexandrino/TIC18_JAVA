package manipulandoarrays;

import java.util.ArrayList;

public class ManipulandoArrays {

    private  String nomes[];
    private int contador;


    public ManipulandoArrays(){
        nomes = new String[10];
        contador = 0;
    }

    public void preencheNome(String _nome){

        if (nomes.length <= 10){

            nomes[contador] = _nome;
            contador++;
            System.out.println("Nome " + _nome + " inserido com sucesso!");

        } else {

            System.out.println("Array de nomes está cheio!");
            contador = 0;

        }

    }

    public boolean contemNome(String _nome){

        boolean contemNome = false;

        for (String nome : nomes ){

            if (nome == _nome){
                contemNome = true;
                break;
            }

        }

        return contemNome;
    }

}
