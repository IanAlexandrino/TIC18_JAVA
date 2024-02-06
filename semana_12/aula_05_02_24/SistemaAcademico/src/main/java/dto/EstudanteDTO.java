package dto;

public class EstudanteDTO {

    private String Nome;
    private String Matricula;
    private String Email;
    private String Curso;

    public EstudanteDTO(){
    }

    public EstudanteDTO(String Nome,String Email, String Matricula, String Curso){

        this.Nome = Nome;
        this.Email = Email;
        this.Matricula = Matricula;
        this.Curso = Curso;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }
}
