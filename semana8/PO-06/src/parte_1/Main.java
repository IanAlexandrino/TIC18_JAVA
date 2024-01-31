package parte_1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ArquivoLeitura arquivoLeitura = new ArquivoLeitura();
        try {

            arquivoLeitura.lerArquivo();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}
