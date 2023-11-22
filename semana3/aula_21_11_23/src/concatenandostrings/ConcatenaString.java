package concatenandostrings;

public class ConcatenaString {

    private String string1, string2, stringResultado;

    public void ConcatenaStrings(String _string1, String _string2){
        this.string1 = _string1;
        this.string2 = _string2;

        stringResultado = string1 + string2;

        System.out.println(stringResultado);
    }

    public void ExibeStrings(){

        System.out.println("Primeira string digitada: ");
        System.out.println(string1);

        System.out.println("Segunda string digitada: ");
        System.out.println(string2);

        System.out.println("String resultado: ");
        System.out.println(stringResultado);
    }

}
