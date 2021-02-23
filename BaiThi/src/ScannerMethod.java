import java.util.Scanner;

public class ScannerMethod {
    Scanner Sc = new Scanner(System.in);
    public String ScannerName(){
        System.out.println("Name");
        return Sc.nextLine();
    }

    public String ScannerPhoneNumber(){
        System.out.println("PhoneNumber");
        return Sc.nextLine();
    }

    public String ScannerAddress(){
        System.out.println("Address");
        return Sc.nextLine();
    }

    public String ScannerEmail(){
        System.out.println("Email");
        return Sc.nextLine();
    }

    public String ScannerFacebook(){
        System.out.println("Facebook");
        return Sc.nextLine();
    }
}
