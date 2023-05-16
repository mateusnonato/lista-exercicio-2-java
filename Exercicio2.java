import java.util.Scanner; 
public class Exercicio2{
    public static void main(String[] args){
    double compra, pagamento, troco;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nCalculo do troco.");
    System.out.println("Informe o valor da compra: ");
    compra = scanner.nextInt();

    System.out.println("\nInforme o valor pago: ");
    pagamento = scanner.nextInt();
    
    if (pagamento < compra){
    System.out.println("O valor pago é insuficiente!");
    }
    else if (pagamento == compra){
        System.out.printf("\nPagamento aprovado! Seu troco é de: R$ 0.00");
    }
    else {
        troco = pagamento - compra;
        double nota50, nota20, nota10, nota5, nota2, nota1;

        System.out.println("\nPagamento aprovado!");
        System.out.printf("\nSeu troco é: %.2f", troco);
        nota50 = Math.floor(troco/50);
        System.out.printf("\nNotas de R$50: %.0f", (nota50));
        nota20 = Math.floor((troco - (50 * nota50))/20);
        System.out.printf("\nNotas de R$20: %.0f", (nota20));
        nota10 = Math.floor((troco - ((20 * nota20) + (50 * nota50)))/10);
        System.out.printf("\nNotas de R$10: %.0f", (nota10));
        nota5 = Math.floor((troco - ((10 * nota10) + (20 * nota20) + (50 * nota50)))/5);
        System.out.printf("\nNotas de R$5: %.0f", (nota5));
        nota2 = Math.floor((troco - ((5 * nota5) + (10 * nota10) + (20 * nota20) + (50 * nota50)))/2);
        System.out.printf("\nNotas de R$2: %.0f", (nota10));
        nota1 = Math.floor(troco - ((2 * nota2) + (5 * nota5) + (10 * nota10) + (20 * nota20) + (50 * nota50)));
        System.out.printf("\nNotas de R$1: %.0f", (nota1));
    }
     scanner.close();
    }
}