package hospital;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Paciente> pacientes;
    ArrayList<AgentesSaude> agentesSaude;
    ArrayList<Procedimento> procedimentos;

    public Hospital(){
        pacientes = new ArrayList<>();
        agentesSaude = new ArrayList<>();
        procedimentos = new ArrayList<>();
    }

    public void Triagem(){

    }
}
