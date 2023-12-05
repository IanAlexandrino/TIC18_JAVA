package hospital;

import java.util.ArrayList;

public class Procedimento {
    private String nome;
    private String tipoProcedimento;
    private Medicamento medicamento;
    private ArrayList<Medicamento> medicamentos;
    private Insumo insumo;
    private ArrayList<Insumo> insumos;
    private AgentesSaude agentesSaude;
    private ArrayList<AgentesSaude> agentesSaudeColecao;

    public Procedimento(){
        medicamento = new Medicamento();
        medicamentos = new ArrayList<>();
        insumo = new Insumo();
        insumos= new ArrayList<>();
        agentesSaude = new AgentesSaude();
        agentesSaudeColecao = new ArrayList<>();
    }
}
