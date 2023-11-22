package verificandoparidade;

public class ParidadeInteiros {
    private int num;

    public void ParImpar(int _num){
        this.num = _num;

        if (num % 2 == 0){

            System.out.println("O número informado é par!");

        }else{

            System.out.println("O número informado é impar!");

        }
    }
}
