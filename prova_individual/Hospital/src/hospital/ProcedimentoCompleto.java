package hospital;

import java.util.ArrayList;

public class ProcedimentoCompleto {
    private Procedimento procedimento;
    private ArrayList<Procedimento> procedimentos;

    public ProcedimentoCompleto(){
        procedimento = new Procedimento();
        procedimentos = new ArrayList<>();
    }
}
