import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double size = Double.parseDouble(scanner.nextLine());
        double totalSpace = (length * 100) * (width * 100);

        double wardrobeSize = size * 100 * size * 100;
        double bench = totalSpace /10;
        double freeSpace = totalSpace - wardrobeSize - bench;
        double dancers = freeSpace / 7040;
        System.out.printf("%.0f", Math.floor(dancers));






    }
}
