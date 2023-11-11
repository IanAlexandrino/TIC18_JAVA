public class Conversor {
    private float celsius;
    private float fahrenheit;

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    };

    public float getCelsius() {
        return celsius;
    };

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    };

    public float getFahrenheit() {
        return fahrenheit;
    };

    public void ConverteCelsiusFahrenheit(float _celsius){
        this.celsius = _celsius;

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("\nOs " + celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit!\n");
    };

    public void ConverteFahrenheitCelsius(float _fahrenheit){
        this.fahrenheit = _fahrenheit;

        celsius = (fahrenheit - 32) * 5/9;

        System.out.println("\nOs " + fahrenheit + " graus Fahrenheit equivalem a " + celsius + " graus Celsius!\n");
    };
}
