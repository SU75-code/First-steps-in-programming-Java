import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double TableCloth = tables * (length + 0.60 ) * (width + 0.60);
        double Carpet = tables * (length /2 ) * (length/2);
        double priceInDollars = TableCloth * 7 + Carpet * 9;
        double priceInLv = priceInDollars * 1.85;
        System.out.printf("%.2f USD%n", priceInDollars);
        System.out.printf("%.2f BGN", priceInLv);



    }
}
