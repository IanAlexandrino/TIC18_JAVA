package hospital;

import java.util.ArrayList;

public class Procedimento {
    private String nome;
    private String tipoProcedimento;
    private AgentesSaude agentesSaude;
    private ArrayList<AgentesSaude> agentesSaudeColecao;

    public Procedimento(){
        agentesSaude = new AgentesSaude();
        agentesSaudeColecao = new ArrayList<>();
    }
}
