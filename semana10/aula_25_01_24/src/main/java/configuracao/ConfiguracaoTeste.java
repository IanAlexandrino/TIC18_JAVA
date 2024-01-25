package configuracao;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConfiguracaoTeste {

    @Test
    public void testeMetodo1() {
        Configuracao configuracaoTeste = new Configuracao();

        configuracaoTeste.setNome("penis");
        System.out.println(configuracaoTeste.getNome());
    }

    @Test
    public void testeMetodo2() {
        // Seu código de teste aqui
    }

}
