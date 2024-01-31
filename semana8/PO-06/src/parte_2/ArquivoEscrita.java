package parte_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ArquivoEscrita {

    private File arquivo;
    private boolean existe;
    private FileWriter fw;
    private BufferedWriter bw;

    public ArquivoEscrita(){

        arquivo = new File("saida.txt");
        existe = arquivo.exists();

    }

    public void escreverArquivo() throws IOException {

        Scanner entrada = new Scanner(System.in);
        boolean auxWhileArquivo = true;

        if (!existe){

            arquivo.createNewFile();
            arquivo.mkdir();

        }

        fw = new FileWriter(arquivo);
        bw = new BufferedWriter(fw);

        while (auxWhileArquivo){

            System.out.println("Informe o que você quer adicionar no arquivo saida.txt:");
            String auxInsereDadoArquivo = entrada.nextLine();
            bw.write(auxInsereDadoArquivo);
            bw.newLine();

            System.out.println("Ainda deseja inserir algum outro dado(S/N)?");
            String auxFechaWhile = entrada.nextLine();
            if (Objects.equals(auxFechaWhile, "N")){

                auxWhileArquivo = false;

            }

        }

        System.out.println("Dados inseridos com sucesso!");

        bw.close();
        fw.close();


    }

}
