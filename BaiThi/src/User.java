import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        do {
            System.out.println("1: add");
            System.out.println("2: remote");
            System.out.println("3: Search");
            System.out.println("4: Update");
            System.out.println("5: Show All");
            System.out.println("Your chose");
            int choice = Integer.parseInt( new Scanner(System.in).nextLine());
            SwitchCase(choice);
        }while (true);
    }
    public static void SwitchCase(int number){
        Method method = new Method();
        switch (number) {
            case 1 -> {
                method.add();
            }
            case 2 -> {
                System.out.println("Input PhoneNumber to remote");
                Contacts contacts = method.remote(new Scanner(System.in).nextLine());
                System.out.println(contacts.toString());
            }
            case 3 -> {
                System.out.println("Input Name to Search");
                method.Search(new Scanner(System.in).nextLine());
            }
            case 4 -> {
                System.out.println("Input Name to Update");
                boolean status = method.Update(new Scanner(System.in).nextLine());
                System.out.println(status);
            }
            case 5 -> method.ShowAll();
        }
    }
}
