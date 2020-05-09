import java.util.Scanner;

public class PetShop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double foodPrice1 = 2.50;
        double foodPrice2 = 4.0;
        double totalPrice  = dogs * foodPrice1 + animals * foodPrice2;
        System.out.printf("%.2f", totalPrice);
        System.out.print(" "+ "lv.");

    }
}
