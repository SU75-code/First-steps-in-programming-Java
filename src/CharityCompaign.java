import java.util.Scanner;

public class CharityCompaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days = Double.parseDouble(scanner.nextLine());
        double confectioners = Double.parseDouble(scanner.nextLine());
        double cakes = Double.parseDouble(scanner.nextLine());
        double corrugations  = Double.parseDouble(scanner.nextLine());
        double pancakes = Double.parseDouble(scanner.nextLine());
        double cakesPrice = cakes * 45;
        double corrugationsPrice = corrugations * 5.80;
        double pancakesPrice = pancakes * 3.20;
        double SumForDay = (cakesPrice + corrugationsPrice + pancakesPrice) * confectioners;
        double SumFromCompagny = SumForDay * days;
        double TotalSum = SumFromCompagny - (SumFromCompagny/8);
        System.out.printf("%.2f", TotalSum);




    }
}
