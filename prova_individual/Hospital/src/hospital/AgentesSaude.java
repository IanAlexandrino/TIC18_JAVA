package hospital;

import java.util.ArrayList;

public class AgentesSaude {
    private Medico medico;
    private Enfermeiro enfermeiro;

    private ArrayList<AgentesSaude> agentesSaude;

    public AgentesSaude(){
        medico = new Medico();
        enfermeiro = new Enfermeiro();
        agentesSaude = new ArrayList<>();
    }
}
