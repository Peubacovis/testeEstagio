import java.util.Scanner;

public class testeEstagioVerificarLetra {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra:");
            String  palavra = scanner.next();

            char minuscula = 'a';
            char maiuscula = 'A';
            int numero = 0;

            for (int i = 0; i < palavra.length(); i++ ) {
                if (palavra.charAt(i) == minuscula || palavra.charAt(i) == maiuscula) {
                    numero++;
                }
            }

            System.out.println("A letra 'a' aparece " + numero + " vezes.");
        }
}
