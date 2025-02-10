import java.util.Scanner;

public class QueEres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int thisYear = 2025;
        System.out.println("Por favor, me puedes decir tu año de nacimiento: ");
        int birthYear = sc.nextInt();
        int age;

        if (birthYear>thisYear) {
            System.out.println("El año especificado no es posible");
        } else if (birthYear<1970) {
            age = thisYear - birthYear;
            System.out.println ("Eres un@ pipiol@ de ... " + age + " años");
        } else if (birthYear>=1970 && birthYear<=1980) {
            age = thisYear - birthYear;
            System.out.println ("Eres un@ baby boomeer... de ... " + age + " años");
        } else if (birthYear>=1980 && birthYear<1990) {
            age = thisYear - birthYear;
            System.out.println ("Eres un@ ochenter@... de ... " + age + " años");
        } else if (birthYear>=1980 && birthYear<1990) {
            age = thisYear - birthYear;
            System.out.println ("Eres un@ finalist@... del siglo XX ... " + age + " años");
        } else {
            age = thisYear - birthYear;
            System.out.println ("Eres un@ pipiol@... de ... " + age + " años");
        }
    }
}