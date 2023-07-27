package javabasico.aula34.modificadorstatic.exercicios;

public class Contador {

    private static int contagem;

    Contador(){
        contagem++;
    }

    public static int getContagem() {
        return contagem;
    }

    public static void setContagem(int valor){
        contagem += valor;// nao se usa o this.contagem pois contagem é geral da classe
        // nao será para o item instanciado. é um valor pertencente a classe toda, algo acima
        // do instanciamento.Ex: independente da instaciacao, contagem vai contar
        // para todos daquela classe ao mesmo tempo
    }

    public static void zerarContagem(){
        contagem = 0;
    }
}
