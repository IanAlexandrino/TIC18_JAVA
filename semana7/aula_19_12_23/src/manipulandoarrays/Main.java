package manipulandoarrays;

public class Main {

    public static void main(String[] args) {

        ManipulandoArrays array = new ManipulandoArrays();

        array.preencheNome("Pedro");
        array.preencheNome("José");
        array.preencheNome("Rodrigo");
        array.preencheNome("Josias");
        array.preencheNome("Gustavo");
        array.preencheNome("David");
        array.preencheNome("Igor");
        array.preencheNome("Daniel");
        array.preencheNome("Janio");
        array.preencheNome("Lucas");
        array.preencheNome("teste");
        System.out.println(array.contemNome("Pedro"));

    }
}