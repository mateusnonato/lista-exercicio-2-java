import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {

    double num1, num2;
    String operador;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nOperação com dois numeros.");

    System.out.println("\nDigite o primeiro numero:");
    num1 = scanner.nextDouble();
    System.out.println("\nDigite o segundo numero:");
    num2 = scanner.nextDouble();
    System.out.println("\nDigite o operador: (+ - / * ^)");
    operador = scanner.next();

    switch (operador){
        
    case "+":
    System.out.printf("O resultado da soma é: %.2f", num1 + num2);
    break;

    case "-":
    System.out.printf("O resultado da subtração é: %.2f", num1 - num2);
    break;

    case "*":
    System.out.printf("O resultado da multiplicação é: %.2f", num1 * num2);
    break;

    case "/":
    System.out.printf("O resultado da divisão é: %.2f", num1 / num2);
    break;

    case "^":
    System.out.printf("O resultado da pontencia é: %.2f", Math.pow(num1, num2));
    break;

    default:
    System.out.println("Operador invalido");
    }
    scanner.close();
}
}
