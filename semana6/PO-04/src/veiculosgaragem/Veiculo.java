package veiculosgaragem;

abstract class Veiculo {

    private String modelo;
    private String cor;
    private int ano;
    private boolean eletrico;

    public Veiculo(String modelo, String cor, int ano, boolean eletrico){

        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.eletrico = eletrico;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    public boolean getEletrico(){
        return eletrico;
    }

    public String acelerar(){
     return "Veículo acelerando!";
    }

    public String ligar(){
        return "Veículo ligado!";
    }

    public String parar(){
        return "Veículo parado!";
    }

    public void estacionar(Garagem garagem){

        garagem.estacionar(this);

        if (garagem.getTomadaCargaEletrica() == true && this.eletrico == true){

            System.out.println("Veículo carregando!");

        } else {

            System.out.println("Veículo estacionado!");

        }

    }
}
