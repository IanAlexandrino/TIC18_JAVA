package parte_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ArquivoEscrita arquivoEscrita = new ArquivoEscrita();
        try {

            arquivoEscrita.escreverArquivo();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}
