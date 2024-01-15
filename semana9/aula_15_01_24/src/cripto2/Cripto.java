package cripto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Cripto {
    public static void CopiaImagem(String file1, String file2, String senha){



        try {
            FileInputStream fileBase = new FileInputStream(file1);
            boolean eof = false;
            ArrayList<Integer> data = new ArrayList<>();
            ArrayList<Integer> dataFinal = new ArrayList<>();
            int[] maiorByte = {1, 1, 1, 1, 1, 1, 1, 1};

            while (!eof){
                int input = fileBase.read();
                if (input != -1){

                    data.add(input);

                } else eof = true;

            }

            int auxMaiorByte = 0;

            for (int i = 0; i < data.size(); i++) {

                if (auxMaiorByte > 7){
                    auxMaiorByte = 0;
                    int xorResult = data.get(i) ^ maiorByte[auxMaiorByte];
                    dataFinal.add(xorResult);
                    auxMaiorByte++;

                } else {

                    int xorResult = data.get(i) ^ maiorByte[auxMaiorByte];
                    dataFinal.add(xorResult);
                    auxMaiorByte++;

                }

            }

            FileOutputStream fileDestino = new FileOutputStream(file2);

            for (int i = 0 ; i < data.size() ; i++){

                fileDestino.write(dataFinal.get(i));

            }

            fileBase.close();
            fileDestino.close();

        } catch (IOException e) {
            System.out.println("Error --" + e.toString());
        }

    }
}
