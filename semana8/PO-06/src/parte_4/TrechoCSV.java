package parte_4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class TrechoCSV {

    private static final File arquivo = new File("Trecho.csv");
    private static final boolean existe = arquivo.exists();

    public static void insereDadosArquivo(Trecho trecho) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, existe))){

            if (!existe){

                arquivo.createNewFile();
                arquivo.mkdir();
                bw.write("TrechoOrigem;TrechoDestino\n");

            }

            bw.write(trecho.getOrigemTrecho() + ";" + trecho.getDestinoTrecho() + "\n");

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }

    }

    public static ArrayList<Trecho> carregaDadosArquivo(){

        ArrayList<Trecho> trechos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            String linha;
            br.readLine();
            while (br.ready()){

                linha = br.readLine();
                String[] vect = linha.split(";");
                Trecho trecho = new Trecho();
                PontosParada pontosParadaOrigem = new PontosParada();
                PontosParada pontosParadaDestino = new PontosParada();
                pontosParadaOrigem.setLocal(vect[0]);
                System.out.println(vect[0]);
                pontosParadaDestino.setLocal(vect[1]);
                System.out.println(vect[1]);
                trecho.setOrigemTrecho(pontosParadaOrigem);
                trecho.setDestinoTrecho(pontosParadaDestino);
                System.out.println(trecho.getOrigemTrecho());
                System.out.println(trecho.getDestinoTrecho());
                trechos.add(trecho);

            }

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }
        return trechos;
    }

}
