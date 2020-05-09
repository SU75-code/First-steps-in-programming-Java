import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wedth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percents = Double.parseDouble(scanner.nextLine());
        int volume = length * wedth * height;
        double liters = volume * 0.001;
        double result = liters - liters * percents/100;
        System.out.printf("%.3f", result);

    }
}
