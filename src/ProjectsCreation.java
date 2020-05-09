import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = 3;
        int numbers = projects * hours;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", firstName, numbers, projects);

    }
}
