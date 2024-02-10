package parte_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TrajetoCSV {

    private static final File arquivo = new File("Trajeto.csv");
    private static final boolean existe = arquivo.exists();

    public static void insereDadosArquivo(Trajeto trajeto) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, existe))){

            if (!existe){

                arquivo.createNewFile();
                arquivo.mkdir();
                bw.write("Trajeto\n");

            }

            bw.write(trecho.getOrigemTrecho() + ";" + trecho.getDestinoTrecho() + "\n");

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }

    }

}
