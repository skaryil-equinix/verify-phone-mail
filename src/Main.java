public class Main {
    public static void main(String[] args) {

        Address addr1 = new Address();
        Person Thiery = new Person("Thiery", addr1, "thiery@gamil.com", "8833445566", 533000, null);
        Person Henry = new Person("Henry", addr1, "henry@gamil.com", "5566334455", 330000, Thiery);
        Person Saka = new Person("Saka", addr1, "saka.@gamil.com", "007", 300000, Henry);

        Saka.printHeirarchy();
        Thiery.verifyEmail();
        Saka.verifyPhone();
    }
}