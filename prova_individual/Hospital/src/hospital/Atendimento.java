package hospital;

import java.util.ArrayList;

public class Atendimento {
    private String tipo;
    private boolean urgencia;
    private Paciente paciente;
    private Procedimento procedimento;
    private ArrayList<Procedimento> procedimentos;

    public Atendimento(){
        paciente = new Paciente();
        procedimento = new Procedimento();
        procedimentos = new ArrayList<>();
    }
}
