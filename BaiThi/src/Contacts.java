public class Contacts {
    private String name;
    private String PhoneNumber;
    private String Address;
    private String Email;
    private String Facebook;

    public Contacts(){}

    public Contacts(String name, String phoneNumber, String address, String email, String facebook) {
        this.name = name;
        PhoneNumber = phoneNumber;
        Address = address;
        Email = email;
        Facebook = facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Facebook='" + Facebook + '\'' +
                '}';
    }
}
