import java.time.Year;
import java.util.Scanner;

public class QueEres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thisYear = Year.now().getValue();

        System.out.println("Por favor, dime tu año de nacimiento: ");
        int birthYear = sc.nextInt();

        if (birthYear > thisYear) {
            System.out.println("El año especificado no es posible");
        } else {
            int age = thisYear - birthYear;
            String generacion = getGeneracion(birthYear);
            System.out.printf("Eres un@ %s de %d años%n", generacion, age);
        }

        sc.close();
    }

    private static String getGeneracion(int birthYear) {
        if (birthYear < 1970) return "pipiol@";
        if (birthYear <= 1980) return "baby boomer";
        if (birthYear < 1990) return "ochenter@";
        if (birthYear < 2000) return "finalist@ del siglo XX";
        return "pipiol@";
    }
}