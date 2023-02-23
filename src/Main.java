import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer stefan = new Customer("Alecu Stefan", "231412412412313", 4321, 500, Currency.LEI);
        ATM atm = new ATM();
        atm.welcome(stefan);
    }



}