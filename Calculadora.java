package javabasico.aula34.modificadorstatic.exercicios;

public class Calculadora {

    private static double result;

    public static double sum(double valor1, double valor2){
        return result = valor1 + valor2;
    }

    public static double minus(double valor1, double valor2){
        return result = valor1 - valor2;
    }

    public static double multiply(double valor1, double valor2){
        return result = valor1 * valor2;
    }

    public static double dividedBy(double valor1, double valor2){
        return result = valor1 / valor2;
    }
    // exercicio03 criar metodo para calcular fatorial

    public static double factorial(int valor1){

        int factorialResult = 1;
        for(int i =1; i<=valor1; i++){
            factorialResult *= i;
        }
        return factorialResult;
    }
}
