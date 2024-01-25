package configuracao;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConfiguracaoTeste {

    @Test
    public void testeAlfabeto() {
        Configuracao configuracaoTeste = new Configuracao();

        configuracaoTeste.setNome("PEDRO0");
        System.out.println(configuracaoTeste.getNome());
        try {

            configuracaoTeste.definirAlfabeto("abcde");
            System.out.println(configuracaoTeste.getAlfabeto());

        } catch (Exception exception){

            exception.getMessage();

        }

    }

    @Test
    public void testeMetodo2() {
        // Seu código de teste aqui
    }

}
