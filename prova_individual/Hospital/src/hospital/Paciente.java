package hospital;

public class Paciente {
    private String cpf;
    private String nome;
    private String atendimento;

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
