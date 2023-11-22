package calculoretangulo;

public class CalculaAreaRetangulo {
    private int altura, largura;

    public void calculaArea(int _altura, int _largura){
        this.altura = _altura;
        this.largura = _largura;

        System.out.println("A área do triângulo é: " + ((largura * altura) / 2));
    }

}
