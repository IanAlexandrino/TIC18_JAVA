package parte_1;

import java.io.*;

public class ArquivoLeitura {

    private File arquivo;
    private boolean existe;
    private FileReader fr;
    private BufferedReader br;

    public ArquivoLeitura(){

        arquivo = new File("entrada.txt");
        existe = arquivo.exists();

    }

    public void lerArquivo(){

        if (!existe){

            try {

                arquivo.createNewFile();
                arquivo.mkdir();

            } catch (IOException e) {

                throw new RuntimeException(e);

            }

        } else {

            System.out.println("Arquivo já existe!");

        }

    }

}
