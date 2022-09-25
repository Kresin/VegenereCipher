import cypher.VegenereCypher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VegenereCypher vegenereCypher = new VegenereCypher();

        int option = 1;
        while (option != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 1 para criptografar; 2 para descriptografar ou 3 para sair");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                System.out.println("Digite o texto que deve ser criptografado");
                String textToCypher = scanner.nextLine().toUpperCase();
                System.out.println("Digite a chave para criptografar o texto");
                String key = scanner.nextLine().toUpperCase();
                System.out.println(vegenereCypher.cypher(textToCypher, vegenereCypher.generateKey(textToCypher, key)));
            } else if (option == 2) {
                System.out.println("Digite o texto que deve ser descriptografado");
                String textToDecrypt = scanner.nextLine().toUpperCase();
                System.out.println("Digite a chave para descriptografar o texto");
                String key = scanner.nextLine().toUpperCase();
                System.out.println(vegenereCypher.decrypt(textToDecrypt, vegenereCypher.generateKey(textToDecrypt, key)));
            }
        }
    }

}
