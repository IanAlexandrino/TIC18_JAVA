package hospital;

public class AgentesSaude {
    private Medico medico;
    private Enfermeiro enfermeiro;

    public AgentesSaude(){
        medico = new Medico();
        enfermeiro = new Enfermeiro();
    }
}
