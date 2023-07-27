package javabasico.aula34.modificadorstatic.exercicios;

public class MainCalculadora {
    public static void main(String[] args){

        System.out.println(Calculadora.sum(2,7));
        System.out.println(Calculadora.minus(2,7));

        System.out.println(Calculadora.dividedBy(90, 3));
        System.out.println(Calculadora.multiply(2,7));

        System.out.println("Testando o fatorial de 3: " + Calculadora.factorial(7));
    }
}
