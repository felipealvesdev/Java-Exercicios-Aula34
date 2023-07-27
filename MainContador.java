package javabasico.aula34.modificadorstatic.exercicios;

public class MainContador {
    public static void main(String[] args){

        Contador count1 = new Contador();
        Contador count2 = new Contador();


        System.out.println("O valor do contador após count2: " + Contador.getContagem());

        Contador.setContagem(10);
        System.out.println(Contador.getContagem());
        Contador.setContagem(-30);
        System.out.println(Contador.getContagem());

        Contador.zerarContagem();
        System.out.println(Contador.getContagem());
        // todos os gettes e setters -------  funcionam -----
    }
}
