package parte_3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ArquivoCopia arquivoCopia = new ArquivoCopia();
        try {

            arquivoCopia.copiaConteudoArquivo();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}
