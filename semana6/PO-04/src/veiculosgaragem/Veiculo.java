package veiculosgaragem;

abstract class Veiculo {

    private String modelo;
    private String cor;
    private int ano;

    public String acelerar(){
     return "Veículo acelerando!";
    }

    public String ligar(){
        return "Veículo ligado!";
    }

    public String parar(){
        return "Veículo parado!";
    }
}
