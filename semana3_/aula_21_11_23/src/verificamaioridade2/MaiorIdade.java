package verificamaioridade2;

public class MaiorIdade {
    private int diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, idade;

    public void calculaIdade(int _diaNasc, int _mesNasc, int _anoNasc, int _diaAtual, int _mesAtual, int _anoAtual){
        this.diaNasc = _diaNasc;
        this.mesNasc = _mesNasc;
        this.anoNasc = _anoNasc;
        this.diaAtual = _diaAtual;
        this.mesAtual = _mesAtual;
        this.anoAtual = _anoAtual;

        if (mesAtual < mesNasc){

            idade = anoAtual - anoNasc -1;

        } else if (diaAtual > diaNasc && mesNasc == mesAtual){

            idade = anoAtual - anoNasc -1;

        } else {

            idade = anoAtual - anoNasc;

        }

        System.out.println(idade);
    }
}
