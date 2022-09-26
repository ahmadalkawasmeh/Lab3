public class BuddyInfo {

    private String name;
    private String address;
    private String phone;


    private String getName() {
        return this.name;
    }

    private String getAddress() {
        return this.address;
    }

    private String getPhone() {
        return this.phone;
    }


    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    private BuddyInfo() {
        name = "Homer";
        address = "2100 Colonel by Dr";
        phone = "613";
    }







    public static void main(String[] args){
        System.out.println("Hello" + " " + new BuddyInfo().name);
    }
}


















