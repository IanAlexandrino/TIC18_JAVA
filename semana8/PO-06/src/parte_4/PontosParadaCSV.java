package parte_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PontosParadaCSV {

    private static final File arquivo = new File("PontosParada.csv");
    private static final boolean existe = arquivo.exists();

    public static void insereDadosArquivo(PontosParada pontosParada) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, existe))){

            if (!existe){

                    arquivo.createNewFile();
                    arquivo.mkdir();
                    bw.write("Local\n");

            }

            bw.write(pontosParada.getLocal() + "\n");

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }

    }
}
