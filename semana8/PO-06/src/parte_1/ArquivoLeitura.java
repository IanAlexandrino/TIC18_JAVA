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

    public void lerArquivo() throws IOException {

        if (!existe){

                arquivo.createNewFile();
                arquivo.mkdir();

        }

        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);

        while (br.ready()){

            String linha = br.readLine();
            System.out.println(linha);

        }

        br.close();
        fr.close();

    }

}
