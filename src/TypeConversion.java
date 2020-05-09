import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -50;
        int result = Math.abs(number);
        System.out.println(result);
        System.out.println(number);

        double radius = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * radius *radius;
        double perimeter = 2* Math.PI * radius;
        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);


    }

}
