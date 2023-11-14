package aula_atual_cliente;

public class Cliente {
    private String  nome, cpf;
    private int idade;

    public Cliente(String _nome, String _cpf){
        this.nome = _nome;
        this.cpf = _cpf;
        idade = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


}
