import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double colBear = Double.parseDouble(scanner.nextLine());
        double colWine = Double.parseDouble(scanner.nextLine());
        double colRakia = Double.parseDouble(scanner.nextLine());
        double colWhiskey = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice * 0.6;
        double bearPrice = rakiaPrice * 0.2;

        double totalSum = whiskeyPrice *colWhiskey + bearPrice * colBear + winePrice * colWine + rakiaPrice * colRakia;

        System.out.printf("%.2f", totalSum);



    }
}
