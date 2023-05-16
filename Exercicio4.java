import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
double raio;
int opcao;
Scanner scanner = new Scanner(System.in);

System.out.println("\nPrograma que imprime o perímetro e área do circulo e o volume da esfera.");

System.out.println("\nDigite \n1: calcular e imprimir o perímetro do círculo. \n2: calcular e imprimir a área do círculo. \n3: calcular e imprimir o volume da esfera: ");
opcao = scanner.nextInt();
 
if ((opcao == 1)){
System.out.println("\nCalcular e imprimir o perímetro do círculo.");
System.out.println("Digite o raio:");
raio = scanner.nextDouble();
double perimetro = 2 * Math.PI * raio;
System.out.printf("\nO valor do perimetro é: %.2f", perimetro);
}
else if ((opcao == 2)){
    System.out.println("\nCalcular e imprimir a área do círculo");
    System.out.println("Digite o raio:");
    raio = scanner.nextDouble();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.printf("\nO valor da area é: %.2f", area);
}
else if ((opcao == 3)){
System.out.println("\nCalcular e imprimir o volume da esfera.");
System.out.println("Digite o raio:");
raio = scanner.nextDouble();

double volume = (((Math.PI / 3)*4) * Math.pow(raio, 3));
System.out.printf("\nO valor do volume é: %.2f", volume);
}
else
System.out.println("Programa encerrado.");
scanner.close();
}
}