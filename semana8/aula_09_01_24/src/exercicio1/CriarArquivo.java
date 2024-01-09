package exercicio1;

import java.io.*;
import java.util.Scanner;

public class CriarArquivo {

    private String nomeArquivo;
    private String textoArquivo;

    public CriarArquivo (){

    }

    public void criandoArquivo() {

        boolean op = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, digite o nome do arquivo que você quer criar: ");

        nomeArquivo = entrada.nextLine();

        File arquivo = new File("C:/Users/06569235559/Documents/TIC18_JAVA/semana8/aula_09_01_24/src/exercicio1/" + nomeArquivo + ".txt");

        try {
            arquivo.createNewFile();
            System.out.print("Arquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }



            try (FileWriter fw = new FileWriter(arquivo);
                 BufferedWriter br = new BufferedWriter(fw)) {

                while(op) {

                    System.out.println("Digite uma linha para por no arquivo: ");
                    textoArquivo = entrada.nextLine();

                    if (textoArquivo == "") {
                        op = false;
                        return;
                    }

                    br.write(textoArquivo);
                    br.newLine();

                }

            } catch (IOException e){

                e.printStackTrace();

            }

    }
}
