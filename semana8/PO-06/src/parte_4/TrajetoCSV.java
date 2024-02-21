package parte_4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

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

            for (Trecho trecho : trajeto.getTrajeto()){

                bw.write(trecho.getOrigemTrecho() + "-" + trecho.getDestinoTrecho() + "/");

            }

            bw.write("\n");

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }

    }

    public static ArrayList<Trajeto> carregaDadosArquivo(){

        ArrayList<Trajeto> trajetos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            String linha;
            br.readLine();
            while (br.ready()){

                linha = br.readLine();
                String[] vect = linha.split("-/");
                System.out.println(Arrays.toString(vect));
                int j;

                for (int i = 1 ; i < vect.length ; i += 2){

                    j = i - 1;
                    Trajeto trajeto = new Trajeto();
                    Trecho trecho = new Trecho();
                    PontosParada pontosParadaOrigem = new PontosParada();
                    PontosParada pontosParadaDestino = new PontosParada();
                    pontosParadaOrigem.setLocal(vect[j]);
                    System.out.println(j);
                    System.out.println(i);
                    pontosParadaDestino.setLocal(vect[i]);
                    trecho.setOrigemTrecho(pontosParadaOrigem);
                    trecho.setDestinoTrecho(pontosParadaDestino);
                    trajeto.setTrajeto(trecho);
                    trajetos.add(trajeto);

                }

            }

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }
        return trajetos;
    }

}
