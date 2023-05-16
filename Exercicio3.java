import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	double a, b, c, x1, x2, delta;
	Scanner scanner = new Scanner(System.in);
    
	System.out.println("\nCalculo de equação de segundo grau");

    System.out.println("\nInforme o valor de A: ");
    a = scanner.nextDouble();
    System.out.println("\nInforme o valor de B: ");
    b = scanner.nextDouble();
    System.out.println("\nInforme o valor de C: ");
    c = scanner.nextDouble();
    delta= Math.pow(b,2) - (4 * a * c);

    if ((a == 0) && (b == 0) && (c != 0)){
        System.out.println("\nCoeficientes infomados incorretamente.");
    } 
     else if ( a == 0 && b!=0){
        System.out.println("Essa é uma equaçao do primeiro grau!");
        double resultado = c / b;
        System.out.println("\nA raiz real da equação é: " + resultado);
    }
    else {
    
        if (delta < 0){
            System.out.println("Essa equação não possui raízes reais.");
        }
        else if (delta == 0){
            System.out.println("\nEssa equação possui duas raízes iguais.");
            x1 = - b / (2 * a);
            System.out.println("As raizes tem o valor de: " + x1);
        }
        else {
            System.out.println("\nEssa equação possui duas raízes diferentes.");
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("\nAs raizes da equeção são: " + x1 + "e " + x2);
        }
    }
    scanner.close();
}
}