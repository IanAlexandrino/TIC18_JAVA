package hospital;

import java.util.ArrayList;

public class Medico {
    private String crm;
    private Atendimento atendimento;
    private ArrayList<Atendimento> atendimentos;
    private ArrayList<Atendimento> atendimentosUrgentes;

    public Medico(){
        atendimento = new Atendimento();
        atendimentos = new ArrayList<>();
        atendimentosUrgentes = new ArrayList<>();
    }
}




