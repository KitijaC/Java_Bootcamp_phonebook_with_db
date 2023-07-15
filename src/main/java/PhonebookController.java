import javax.swing.*;

public class PhonebookController {
    public void addContact() {
        Contact contact = new Contact();
        contact.setFirstName(this.getUserInput("Enter First Name"));
        contact.setLastName(this.getUserInput("Enter Last Name"));
        contact.setPhoneNumber(this.getUserInput("Enter Phone Number"));
        contact.setEmail(this.getUserInput("Enter Email"));
        System.out.println(contact);
    }

    public void viewContacts() {

    }

    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}
