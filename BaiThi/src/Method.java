import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public void add() {
        ScannerMethod Scanner = new ScannerMethod();

            String name = Scanner.ScannerName();
            String phone = Scanner.ScannerPhoneNumber();
            String address = Scanner.ScannerAddress();
            String email = Scanner.ScannerEmail();
            String facebook = Scanner.ScannerFacebook();
            contactsArrayList.add(new Contacts(name,phone,address,email,facebook));

    }

    public Contacts remote(String PhoneNumber) {
        Contacts contacts = new Contacts();
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (PhoneNumber.equals(contactsArrayList.get(i).getPhoneNumber())) {
                contacts = contactsArrayList.remove(i);
            }
        }
        return contacts;
    }

    public boolean Update(String name){
        boolean status = false;
        for (Contacts contacts : contactsArrayList) {
            if (name.equals(contacts.getName())) {
                System.out.println("New Name");
                contacts.setName(new Scanner(System.in).nextLine());
                status = true;
            }
        }
        return status;
    }

    public void Search(String name){
        for (Contacts contacts : contactsArrayList) {
            if (name.equals(contacts.getName())) {
                System.out.println(contacts.toString());
            }
        }
    }

    public void ShowAll(){
        for (Contacts contacts : contactsArrayList) {
            System.out.println(contacts.toString());
        }
    }

}
