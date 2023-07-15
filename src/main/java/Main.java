import javax.swing.*;

public class Main {

    private final PhonebookController phonebookController = new PhonebookController();
    public static void main(String[] args) {
        Main main = new Main();
        main.displayMenu();
    }

    public void displayMenu() {
        String userChoice = JOptionPane.showInputDialog(null, """
            Phonebook 1.0
            1. Add Contact
            2. View Contacts
            3. Find Contact
            4. Delete Contact
            5. Update Contact
            6. Exit
        """);


        this.handleUserChoice(userChoice);

    }

    private void handleUserChoice(String userChoice) {
        switch (userChoice){
            case "1":
                this.phonebookController.addContact();
                break;
            case "2":
                this.phonebookController.viewContacts();
                break;
            case "3":
                // find contact
                break;
            case "4":
                // remove contact
                break;
            case "5":
                // update contact
                break;
            case "6":
                System.exit(0);
                break;
            default:
                break;
        }

        this.displayMenu();


    }

    public void start(){
        JOptionPane.showMessageDialog(null, "Hello! welcome to phonebook");

        int response = JOptionPane.showConfirmDialog(null, "Choose something");

        if(response == 0) { System.out.println("User chose yes"); }
        if (response == JOptionPane.YES_OPTION) System.out.println("User chose yes");
        if(response == 1) {System.out.println("User chose no");}
        if(response == 2) {System.out.println("User chose cancel");}
        System.out.println(response);


        String userResponse = JOptionPane.showInputDialog(null, "Write something here");

        JOptionPane.showMessageDialog(null, "You entered: " + userResponse);


    }
}

