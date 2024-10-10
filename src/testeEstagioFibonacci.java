import java.util.Scanner;

public class testeEstagioFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        int proximo;
        boolean pertence = (numero == a || numero == b);

        for (int i = 2; i < 100; i++) {
            proximo = a + b;
            a = b;
            b = proximo;
            if (numero == proximo) {
                pertence = true;
                break;
            }
        }
        if (pertence) {
            System.out.println("Pertence à sequência");
        } else {
            System.out.println("Não pertence à sequência");
        }

        scanner.close();
    }
}
