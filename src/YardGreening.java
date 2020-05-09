import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double totalPrice = squareMeters * price;
        double percentage = 18;
        double discount = percentage/100 * totalPrice;
        double finalPrice = totalPrice - discount;
        System.out.printf(" The final price is: %.2f lv.%n", finalPrice);
        System.out.printf(" The discount is: %.2f lv.", discount);


    }

}
