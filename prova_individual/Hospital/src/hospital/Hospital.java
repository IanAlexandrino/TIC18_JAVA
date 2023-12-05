package hospital;

import java.util.ArrayList;

public class Hospital {
    private Plantao plantao;
    private Paciente paciente;
    private ArrayList<Paciente> pacientes;

    private AgentesSaude agentesSaudeObj;
    private ArrayList<AgentesSaude> agentesSaudeArray;
    private Procedimento procedimento;
    private ArrayList<Procedimento> procedimentos;

    public Hospital(){
        plantao = new Plantao();
        paciente = new Paciente();
        pacientes = new ArrayList<>();
        agentesSaudeObj = new AgentesSaude();
        agentesSaudeArray = new ArrayList<>();
        procedimento = new Procedimento();
        procedimentos = new ArrayList<>();
    }

    public void Triagem(){

    }

    public void Menu(){

    }

    public static void main(String[] args) {

    }
}
