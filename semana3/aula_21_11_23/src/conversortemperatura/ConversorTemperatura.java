package conversortemperatura;

public class ConversorTemperatura {
    float temperatura;

    public void celciusParaFahr(float _temperatura){
        this.temperatura = _temperatura;

        System.out.println("A temperatura em celsius convertida para fahrenheit é: " + ((temperatura * 9/5) + 32));
    }

    public void fahrParCelsius(float _temperatura){
        this.temperatura = _temperatura;

        System.out.println("A temperatura em fahrenheit convertida para celsius é: " + ((temperatura - 32) * 5/9));
    }
}
