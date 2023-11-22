package mediaponderada;

public class MediaPonderada {

    private float nota1, nota2, nota3, peso1, peso2, peso3;

    public void CalculaMediaPonderada(float _nota1, float _nota2, float _nota3, float _peso1, float _peso2, float _peso3){
        this.nota1 = _nota1;
        this.nota2 = _nota2;
        this.nota3 = _nota3;
        this.peso1 = _peso1;
        this.peso2 = _peso2;
        this.peso3 = _peso3;

        float resultado = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada desses valores é " + resultado);
    }

}
