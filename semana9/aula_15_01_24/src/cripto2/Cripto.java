package cripto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Cripto {
    public static void CopiaImagem(String file1, String file2){



        try {
            FileInputStream fileBase = new FileInputStream(file1);
            boolean eof = false;
            ArrayList<Integer> data = new ArrayList<>();
            while (!eof){
                int input = fileBase.read();
                if (input != -1){

                    data.add(input);

                } else eof = true;

            }

            fileBase.close();

            FileOutputStream fileDestino = new FileOutputStream(file2);

            for (int i = 0 ; i < data.size() ; i++){

                fileDestino.write(data.get(i));

            }

            fileDestino.close();

        } catch (IOException e) {
            System.out.println("Error --" + e.toString());
        }

    }
}
