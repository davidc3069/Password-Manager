import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Please Select an Action: (V)iew, (A)dd, (Q)uit");
            char response = Character.toUpperCase(scan.nextLine().charAt(0));

            switch (response) {
                case 'V':
                    view();
                    break;
                case 'A':
                    add();
                    break;
                case 'Q':
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input, Try Again");


            }

        }

    }
    public static void view() throws FileNotFoundException {
        File file = new File("C:\\Users\\david\\IdeaProjects\\passwordManager\\src\\passwords.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());

        }

    }
    public static void add() throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Website: ");
        String website = scan.nextLine();

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

        File file = new File("C:\\Users\\david\\IdeaProjects\\passwordManager\\src\\passwords.txt");
        String fileContent = "Website: " + website + "\nUsername: " + username + "\nPassword: " + password + "\n";
        FileWriter writer = new FileWriter("C:\\Users\\david\\IdeaProjects\\passwordManager\\src\\passwords.txt", true);
        writer.write(fileContent);
        writer.close();
    }
}

