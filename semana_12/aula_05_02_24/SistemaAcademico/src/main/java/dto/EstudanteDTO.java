package dto;

public class EstudanteDTO {

    private String Nome;
    private String Matricula;

    public EstudanteDTO(){
    }

    public EstudanteDTO(String Nome, String Matricula){

        this.Nome = Nome;
        this.Matricula = Matricula;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
}
