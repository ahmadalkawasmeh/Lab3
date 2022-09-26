import java.util.*;

public class AddressBook {
    ArrayList<BuddyInfo> mybuddy;

    public AddressBook() {
        mybuddy = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddyInfo) {
        mybuddy.add(buddyInfo);
    }


    private void removeBuddy(BuddyInfo buddyInfo) {
        mybuddy.remove(buddyInfo);
    }

    public static void main(String[] args){

        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);



    }
}
