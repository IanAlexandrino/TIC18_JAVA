package conversortemperatura2;

public class ConversorTemperatura2 {
    float temperatura;
    int opcao;

    public void converteTemperatura(float _temperatura, int _opcao){
        this.temperatura = _temperatura;
        this.opcao = _opcao;

        if (opcao == 0){

            System.out.println("A temperatura em celsius convertida para fahrenheit é: " + ((temperatura * 9/5) + 32));

        } else if (opcao == 1){

            System.out.println("A temperatura em fahrenheit convertida para celsius é: " + ((temperatura - 32) * 5/9));

        }

    }
}
