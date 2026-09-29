
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num, i, soma = 0;

        for (i = 1; i <= 10; i = i + 1) {
            System.out.println("Digita um número aí");
            num = scanner.nextDouble();
            soma = soma + num;

        }
        System.out.println(soma);

    }
}
