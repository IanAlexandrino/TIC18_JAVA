package academico;

import javax.persistence.*;

@Entity
public class Estudante {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;
    @ManyToOne
    @JoinColumn(name="CodCurso")
    private Curso Curso;
    private String Nome;
    private String Email;
    private String Matricula;

    public Estudante(){

    }

    public Estudante(Integer Id, Curso Curso, String Nome, String Email, String Matricula){

        this.Id = Id;
        this.Curso = Curso;
        this.Nome = Nome;
        this.Email = Email;
        this.Matricula = Matricula;

    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setCurso(academico.Curso curso) {
        Curso = curso;
    }

    public academico.Curso getCurso() {
        return Curso;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMatricula() {
        return Matricula;
    }


}
