package parte_2;

import parte_1.ArquivoLeitura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        if (!existe){

            arquivo.createNewFile();
            arquivo.mkdir();

        } else {

            System.out.println("Arquivo já existe!!");

        }

    }

}
