import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
double numeroUm, numeroDois, numeroTres, media;
Scanner scanner = new Scanner(System.in);

System.out.println("\nPrograma para identificar menor, maior e calcular a media dos numeros informados.");

System.out.println("\nDigite o primeiro numero: ");
numeroUm = scanner.nextDouble();
System.out.println("\nDigite o segundo numero: ");
numeroDois = scanner.nextDouble();
System.out.println("\nDigite o terceiro numero: ");
numeroTres = scanner.nextDouble();

media = (numeroUm + numeroDois + numeroTres) / 3;

//maior numero
if (numeroUm >= numeroDois && numeroUm >= numeroTres){
    System.out.printf(("\nO maior numero é: ") + (numeroUm));
}
else if (numeroDois >= numeroUm && numeroDois >= numeroTres){
    System.out.printf(("\nO maior numero é: ") + (numeroDois));
}
    else if(numeroTres >= numeroUm && numeroTres >= numeroDois){
        System.out.printf(("\nO maior numero é: ") + (numeroTres));
    }
    else {
        System.out.println("\nprograma invalido");
    }

//menor numero
if (numeroUm <= numeroDois && numeroUm < numeroTres){
    System.out.printf(("\nO menor numero é: ") + (numeroUm));
}
else if (numeroDois <= numeroUm && numeroDois <= numeroTres){
    System.out.printf(("\nO menor numero é: ") + (numeroDois));
}
    else if(numeroTres < numeroUm && numeroTres < numeroDois){
        System.out.printf(("\nO menor numero é: ") + (numeroTres));
    }
    else {
        System.out.println("\nprograma invalido");
    }
    
//media dos numeros
System.out.printf(("\nA media dos numeros informados é: ") + (media));

scanner.close();
}
}
