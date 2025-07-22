import java.util.Scanner;

public class LetterUpperLower {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una letra: ");
        char letter = entrada.nextLine().charAt(0);

        if (Character.isUpperCase(letter)) {
            System.out.printf("El caracter %s, está en MAYÚSCULAS.\n", letter);
        } else {
            System.out.printf("El caracter %s, está en minúsculas.\n", letter);
        }

        entrada.close();
    }
}
