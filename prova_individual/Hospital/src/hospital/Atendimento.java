package hospital;

import java.util.ArrayList;

public class Atendimento {
    private String tipo;
    private boolean urgencia;
    private Paciente paciente;
    private ProcedimentoCompleto procedimento;
    private ArrayList<ProcedimentoCompleto> procedimentos;

    public Atendimento(){
        paciente = new Paciente();
        procedimento = new ProcedimentoCompleto();
        procedimentos = new ArrayList<>();
    }
}
